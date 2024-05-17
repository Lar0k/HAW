package simpleCharacterArrayBasedPalindromeTester;

import java.util.Scanner;

/**
 * TestFrame for Palindrome Tester
 * 
 * @author   Michael Schaefers ;  P1@Hamburg-UAS.eu 
 * @version  2017/10/24
 */
public class ProposalForYourTestFrame{
        
    /**
     * Method to start test.
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        // Fuehren Sie (bis auf eine moegliche Aenderung des Klassennamens)
        // KEINE Aenderungen oberhalb dieser Zeilen durch
        //
        // U.U. weist dieser TestFrame erst dann keine Syntax-Fehler mehr auf
        // wenn Sie den PalindromeTester (fehlerfrei) implementiert haben
        //###
        //###
        //###
        //###   HIER kommt Ihr Code zum Testen hin ;-)
        //###
        //###                    VVVV
        //###                    VVVV
        //###                    VVVV
        //###   VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###      VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###         VVVVVVVVVVVVVVVVVVVVVVVVVV
        //###            VVVVVVVVVVVVVVVVVVVV
        //###               VVVVVVVVVVVVVV
        //###                  VVVVVVVV
        //###                     VV
        
        boolean result = false;
        final PalindromeTester palindromeTester = new PalindromeTester();
        
        // Nur ein paar einfache Vorschlaege:
        // ==================================
        
        // Version 1
        String theText_v1 = "blabla";                               // <<-- Der TestCase - zunaechst als String
        char[] text_v1 = theText_v1.toLowerCase().toCharArray();    // String (geeignet) in char[] wandeln
      //result = palindromeTester.isPalindrome( text_v1 );
        //
        System.out.printf(
            "Der Text: \"%s\" ist %s Palindrom\n",
            String.copyValueOf( text_v1 ),                          // char[] in String wandeln
            result ? "ein" : "KEIN"
        );
        System.out.printf( "\n\n" );
        
        
        // Version 2
        char[] text_v2 = { 'l', 'a', 'l', 'i', 'l', 'u' };          // <<-- Der TestCase - direkt als char[]
      //result = palindromeTester.isPalindrome( text_v2 );
        //
        System.out.printf(
            "Der Text: \"%s\" ist %s Palindrom\n",
            String.copyValueOf( text_v2 ),                          // char[] in String wandeln
            result ? "ein" : "KEIN"
        );
        System.out.printf( "\n\n" );
        
        
        System.out.printf( "THIS IS THE END" );
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Fuehren Sie KEINE Aenderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    }//method()
    
}//class
