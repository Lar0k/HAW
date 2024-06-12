package cardComparator;


import static cards.Card.*;
import static cards.Card.Constant.*;

import java.util.*;

import cards.*;
import cards.Card.*;


/**
 * Comparator for Cards defining "usual order"
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */


public class UsualOrder implements Comparator<Card> {

	@Override
	public int compare(Card card1, Card card2) {
		
		//Compare Ranks high to low
		int rankCompare = card2.getRank().compareTo(card1.getRank());
		
		//Adapted order of Suits
		Suit[] suitOrder = new Suit[] {CLUB, SPADES, HEART, DIAMOND};
		
		//Compare Suits
//		int suitCompare = suitOrder[card1.getSuit().ordinal()].compareTo(
//				suitOrder[card2.getSuit().ordinal()]);
		
		int suitCompare = suitOrder[card1.getSuit().ordinal()].ordinal() -
							suitOrder[card2.getSuit().ordinal()].ordinal();
		
		if (rankCompare == 0)   return suitCompare;
		else return rankCompare;
	}
	
}