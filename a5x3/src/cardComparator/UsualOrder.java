package cardComparator;


import static cards.Card.*;
import static cards.Card.Constant.*;

import java.util.*;

import cards.*;
import cards.Card.*;


/**
 * Comparator for Cards defining "usual order"
 * 
 * @author   (Raffael Apitz, Laurin Kamischke) 
 * @version  (240614)
 */


public class UsualOrder implements Comparator<Card> {

	@Override
	public int compare(Card card1, Card card2) {
		
		//Compare Ranks high to low
		int rankCompare = card2.getRank().compareTo(card1.getRank());
		
		//Adapted order of Suits
		Suit[] suitOrder = new Suit[] {CLUB, SPADES, HEART, DIAMOND};
		
		//Compare Suits
		Suit card1Suit = card1.getSuit();
		Suit card2Suit = card2.getSuit();
		int card1SuitOrdinal = card1Suit.ordinal();
		int card2SuitOrdinal = card2Suit.ordinal();
		int card1NewSuitOrdinal = suitOrder[card1SuitOrdinal].ordinal();
		int card2NewSuitOrdinal = suitOrder[card2SuitOrdinal].ordinal();
		int suitCompare = card1NewSuitOrdinal - card2NewSuitOrdinal;

		return (rankCompare == 0) ? suitCompare : rankCompare;
	}
	
}