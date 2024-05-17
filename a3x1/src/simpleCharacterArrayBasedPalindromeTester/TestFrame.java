package simpleCharacterArrayBasedPalindromeTester;


import java.lang.reflect.*;
import java.util.Scanner;


/**
 * TestFrame for Palindrome Tester
 * 
 * @author   Michael Schaefers ;  P1@Hamburg-UAS.eu 
 * @version  2017/10/15
 */
public class TestFrame {
    
    /**
     * Method to start test
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        try(
            final Scanner workAroundForSeriousUserInterface = new Scanner( System.in );
        ){
            System.out.printf( "Gebe ein(en) Wort/Text ein\n" );
            System.out.printf( "und tippe danach die Return-Teste um die Eingabe abzuschliessen.\n" );
            System.out.printf( "=> " );
            //
            final String theText = workAroundForSeriousUserInterface.next();
            final char[] text = theText.toCharArray();
            //
            final PalindromeTester pt = new PalindromeTester();
            final String requestedMethodName = "isPalindrome";
            boolean isPalindromeState;
            try{
                final Class<?> classOfObjectUnderTest = pt.getClass();
                final Method isPalindromeFunction = classOfObjectUnderTest.getMethod( requestedMethodName, char[].class );
                final Object result = isPalindromeFunction.invoke( pt, text );
                isPalindromeState = (boolean)( result );
            }catch( final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex ){
                throw new TestSupportException( String.format( "method \"%s\" can NOT be called properly", requestedMethodName ),  ex );
            }//try 
            
            
            System.out.printf(
                "Der Text: \"%s\" ist %s Palindrom\n",
                String.copyValueOf( text ),
                isPalindromeState ? "ein" : "KEIN"
            );
            System.out.printf( "\n\n" );
            System.out.printf( "THIS IS THE END" );
            
        }catch( final Throwable ex ){
            if( ! (( ex instanceof AssertionError ) || ( ex instanceof IllegalArgumentException ))){
                System.out.flush();
                System.err.printf( "###\n" );
                System.err.printf( "### Uuuupppss, was ist denn da passiert ????\n" );
                System.err.printf( "###\n" );
                System.err.printf( "\n" );
            }//if
            throw( ex );
        }//try
    }//method()
    
    
    
    public static class TestSupportException extends RuntimeException {
        
        @Override
        public Throwable getCause(){
            return causingThrowable;
        }//method()
        
        private TestSupportException( final String message,  final Throwable throwable ){   // package scope on purpose
            super( message );
            causingThrowable = throwable;
        }//constructor()
        private TestSupportException( final String message ){
            this( message, new Throwable( "NO causing throwable existent - directly thrown : "+message ));
        }//constructor()
        private TestSupportException(){
            this( "test support functionality broken" );
        }//constructor()
        
        final private Throwable causingThrowable;
        final static private long serialVersionUID = 2017_10_24_001L;
        
    }//class
    
}//class
