// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package cardProcessor;


import java.util.*;

import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * CardProcessor printing cards in reverse order - see task
 * 
 * @author   (Raffael Apitz, Laurin Kamischke) 
 * @version  (240611)
 */
public class CardProcessor {

	/**
	 * Die Methode reverseOrder() zieht solange Karten von einem Kartenstapel
	 * bis eine gewuenschte Karte gezogen wird
	 * und gibt danach alle gezogenen Karten in umgekehrter Reihenfolge wieder aus.
	 *
	 * @param deck              der Kartenstapel von dem die Karten gezogen werden.
	 * @param lastCard          die gewuenschte Karte, die die Ziehung beendet.
	 * @param dbgOutputEnable   true schaltet Kontrollausgabe an und false aus.
	 */

	public void reverseOrder(Deck deck, Card lastCard, boolean dbgOutputEnable){
		//TODO Asserts
		Card currentCard;
		Stack<Card> dealtCards = new Stack<Card>();
		
		if (dbgOutputEnable == true) {
			System.out.printf("Card to search: %s", lastCard);
			System.out.printf("\n \n");
			System.out.printf("Dealing Cards... ");
			System.out.printf("\n");
		}

		do {
			currentCard = deck.deal();
			dealtCards.push(currentCard);
			if (dbgOutputEnable == true) {
				System.out.printf("%s \n", dealtCards.peek());
			}
		} while (!currentCard.equals(lastCard));
		
		System.out.printf("\n Dealt Cards: \n");
		while (!dealtCards.empty()) {
			System.out.printf("%s \n", dealtCards.pop().toString());
		}
	}

}//class
