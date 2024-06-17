// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package cardProcessor;


import static cards.Card.*;
import static cards.Card.Constant.*;
import cards.*;
import cards.Card.*;
import java.util.*;


/**
 * CardProcessor removing duplicates - see task
 * 
 * @author   (Raffael Apitz, Laurin Kamischke) 
 * @version  (240614)
 */
public class CardProcessor {
    
    /**
     * Die Methode removeDuplicates() entfernt Doppelte aus den übergebenen Karten.
     * Welche Karte (von den mehrfach vorhandenen Karten) übrig bleibt ist egal.
     * Wichtig ist, dass es bei den als Ergebnis abgelieferten Katen keine Doppelten gibt,
     * aber sonst jede Karten erhalten bleibt. 
     *
     * @param cards     die übergebenen Karten aus denen die Doppelten entfernt werden.
     * 
     * @return          die Karten befreit von Doppelten.
     */
	

	public Card[] removeDuplicates(Card... givenCards) {
		Set<Card> noDuplicateCards = new HashSet<Card>();
		
		for (int i = 0; i < givenCards.length; i++) {
			noDuplicateCards.add(givenCards[i]);
		}
		
		Card[] sortedCards = new Card[noDuplicateCards.size()];
		Iterator<Card> cardIterator = noDuplicateCards.iterator();
		
		for (int i = 0; i < sortedCards.length; i++) {
			//TODO hasnext assert
			sortedCards[i] = cardIterator.next();
		}

		return sortedCards;
	}
	
}//class
