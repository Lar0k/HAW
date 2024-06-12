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
 * @version  (240611)
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
	

	public Card[] removeDuplicates2(Card... givenCards) {
		HashSet<Card> sortedCardList = new HashSet<Card>();
		
		for (int i = 0; i < givenCards.length; i++) {
			sortedCardList.add(givenCards[i]);
		}
		
		Card[] sortedCards = new Card[sortedCardList.size()];
		Iterator<Card> cardIterator = sortedCardList.iterator();
		
		for (int i = 0; i < sortedCards.length; i++) {
			sortedCards[i] = cardIterator.next();
		}
		
		return sortedCards;
	}
	
	//---------------------------------------------------------------
	
	public Card[] removeDuplicates(Card... givenCards) {
		ArrayList<Card> sortedCardList = new ArrayList<Card>();
		
		for (int i = 0; i < givenCards.length; i++) {
			if (!sortedCardList.contains(givenCards[i]))    sortedCardList.add(givenCards[i]);
		}
		
		Card[] sortedCards = new Card[sortedCardList.size()];
		
		for (int i = 0; i < sortedCards.length; i++) {
			sortedCards[i] = sortedCardList.removeFirst();
		}
		
		return sortedCards;
	}
    
}//class
