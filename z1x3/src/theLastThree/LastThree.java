// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package theLastThree;
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Wir erinnern uns: NIEMALS verschiedene Sprachen in einem Programm mixen.
 * Oder konkreter: Entweder Code, Variablen und Kommentar in deutsch oder in englisch.
 * Es gelten die in der Vorlesung besprochenen Regeln.
 * Es lohnt sich immer, die Vorlesungsinhalte zu kennen ;-)
 * 
 * Auch ist diese Art von Kommentar KEIN guter Kommentar.
 * Wir nutzen den Kommentar "hier" für Erklärungen und Ausführungen zur
 * Aufgabenstellung. Es  gilt "hier" die Regel:
 *  o) "Kommentar" der Kommentar ist in englisch.
 *  o) "Kommentar" der die Aufgabenstellung vertieft in deutsch.
 *     Löschen Sie derartigen Kommentar vor der Abgabe.
 * 
 * Im Rahmen der Aufgabenstellung müssen Sie GUTEN Kommentar schreiben.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


/**
 * The {@link LastThree} - see task
 * 
 * @author  (your name(s)) 
 * @version (a version number or a date)
 */
public class LastThree {

	Integer frstLast;
	Integer scndLast;
	Integer thrdLast; 


	/**
	 * in the beginning there isn't any number known
	 */
	public LastThree(){    	
	}//method()



	/**
	 * print the last three numbers/values
	 */
	public void printLastThree(){
		
		
		if (thrdLast != null ) {
		System.out.printf("%d  %d  %d \n", thrdLast, scndLast, frstLast);
		}
		
		else if (scndLast != null) {
		System.out.printf("%d  %d \n", scndLast, frstLast);
		}
		
		else if (frstLast != null){
		System.out.printf("%d \n", frstLast);
		}
		
	}//method()

	/**
	 * process new value
	 * 
	 * @param value  current value
	 */
	public void processNewValue( int value ){
			thrdLast = scndLast;
			scndLast = frstLast;
			frstLast = value;
	}//method()

}
