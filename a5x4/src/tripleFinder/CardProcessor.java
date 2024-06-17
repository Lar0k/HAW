package tripleFinder;

import cards.Card;
import cards.Card.Rank;

import java.util.*;
//TODO JavaDoc
public class CardProcessor implements CardProcessor_I {

	private List<Card> cardsToProcess = new ArrayList<Card>();
	private List<Rank> ranksToProcess = new ArrayList<Rank>();
	
	public CardProcessor() {	
	}
	
	@Override
	public Object process(Card givenCard) {

		if (ranksToProcess.indexOf(givenCard.getRank()) != ranksToProcess.lastIndexOf(givenCard.getRank())) {
			return String.format("%s, %s, %s", givenCard, 
					cardsToProcess.get(ranksToProcess.indexOf(givenCard.getRank())), 
					cardsToProcess.get(ranksToProcess.lastIndexOf(givenCard.getRank())));
		}
		cardsToProcess.add(givenCard);
		ranksToProcess.add(givenCard.getRank());

		return null;
	}

	@Override
	public void reset() {
		cardsToProcess.clear();
		ranksToProcess.clear();
	}

}
