package simplifiedBlackJack;


import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;

import java.util.Scanner;


/**
 * Simplified Black Jack Agent - see task
 * 
 * @author  (your name(s)) 
 * @version (a version number or a date)
 */
public class SimplifiedBlackJackAgent {

	// Ersetzen Sie diesen Kommentar durch Ihren Code
	// oder falls kein Code noetig ist, loeschen diesen Kommentar einfach.
	// Hier waere die Stelle fuer moegliche Zustandsvariablen, Exemplarvariablen
	// bzw. Objekt-spezifische Variablen oder einen Konstruktor,
	// sofern derartiges benoetigt wird.
	// Es ist Ihre Entscheidung und sie sollte Sinn machen.



	/**
	 * "Play" Black Jack
	 */
	public void playBlackJack(){
		//VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
		//###
		//###
		//###
		//###           HIER kommt Ihr Code hin
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

		Deck deck = new Deck();
		Card card;
		int points = 0;
		Scanner sc = new Scanner(System.in);
		char userInput;
		boolean goAhead = false;

		do {	
			card = deck.deal();

			switch (card.getRank()) { //Add the points of the cards to the total
				case TWO: points += 2; break;
				case THREE: points += 3; break;
				case FOUR: points += 4; break;
				case FIVE: points += 5; break;
				case SIX: points += 6; break;
				case SEVEN: points += 7; break;
				case EIGHT: points += 8; break;
				case NINE: points += 9; break;
				case TEN:
				case JACK:
				case QUEEN:
				case KING: points += 10; break;
				case ACE: points += 11; break;
				default: System.out.printf("Something went wrong...");
			}//switch()

			//Unnecessary grammar structure (also printing out points and the card)
			if (card.getSuit().name().equals("SPADES"))
				System.out.printf("Card: %s of %s      Points: %d \n", card.getRank().name(), card.getSuit().name(), points);		
			else
				System.out.printf("Card: %s of %sS      Points: %d \n", card.getRank().name(), card.getSuit().name(), points);



			//Command structure for the player's action
			goAhead = false;
			if (points < 21) {
				System.out.printf("Hit (h) or Stand (s)? \n -> ");
				userInput = sc.nextLine().charAt(0);

				if (userInput == 'h') {
					goAhead = true;
				}
				else if (userInput == 's') {
					goAhead = false;
				}

				else {
					assert userInput == 'h' || userInput == 's' : "Invalid Input";
				}
			}
		}while ( points < 21 &&  goAhead == true);  //repeat until (points are 21+ or) the player stands

		if (points > 21) {
			System.out.printf("LOST \n");
		}

		sc.close();

		//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		System.out.flush();
	}//method()

}//class
