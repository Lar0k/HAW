package cardHand;

import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;

public class Hand {

	Card[] cardsInHand = new Card[0];
	int handSize = cardsInHand.length;

	public Hand (Card... cardsInHand) {
		// Assertions if any parameter is null
		assert (cardsInHand != null) : "Invalid Input: Varargs is null";
		for (Card checkAllCards : cardsInHand) {
			assert (checkAllCards != null) : "Invalid Input: Card is null";
		}
		// Initializing the array for the hand
		Card[] newCardsInHand = new Card[cardsInHand.length];
		for (int i = 0; i < cardsInHand.length; i++) {
			newCardsInHand[i] = cardsInHand[i];
		}
		this.cardsInHand = newCardsInHand;
		this.handSize = this.cardsInHand.length;
	}

	public void add (Hand handToAdd) {
		// Copy old hand to new hand
		Card[] newCardsInHand = new Card[handSize + handToAdd.handSize];
		for (int i = 0; i < handSize; i++) {
			newCardsInHand[i] = this.cardsInHand[i];
		}
		// Add the given hand to new hand
		for (int i = handSize; i < handSize + handToAdd.handSize; i++) {
			newCardsInHand[i] = handToAdd.cardsInHand[i - handSize];
		}
		this.cardsInHand = newCardsInHand;
		this.handSize = this.cardsInHand.length;
	}	

	public void add (Card... cardsToAdd) {
		// Copy old hand to new hand
		Card[] newCardsInHand = new Card[handSize + cardsToAdd.length];
		for (int i = 0; i < handSize; i++) {
			newCardsInHand[i] = this.cardsInHand[i];
		}
		// Add new Cards to new hand
		for (int i = handSize; i < handSize + cardsToAdd.length; i++) {
			newCardsInHand[i] = cardsToAdd[i - handSize];
		}
		this.cardsInHand = newCardsInHand;
		this.handSize = this.cardsInHand.length;
	}

	public boolean isSuited() {
		boolean result = true;
		if (this.cardsInHand.length > 0) {
			Suit suitToCheck = this.cardsInHand[0].getSuit();
			int cardsChecked = 1;

			while (result == true && cardsChecked < handSize) {
				if (! cardsInHand[cardsChecked].getSuit().equals(suitToCheck)) {
					result = false;
				}
				cardsChecked++;
			}
		}
		return result;
	}

	//Getter
	public Card[] getHandCards() {
		return cardsInHand;
	}
	//Setter
	public void setHandCards(Card... cardsToSet) {
		//Assertions if any parameter is null
		assert (cardsInHand != null) : "Invalid Input: Varargs is null";
		for (Card checkAllCards : cardsInHand) {
			assert (checkAllCards != null) : "Invalid Input: Card is null";
		}
		//Overwriting the old hand with the given Cards
		Card[] newCardsInHand = new Card[cardsToSet.length];
		for (int i = 0; i < cardsToSet.length; i++) {
			newCardsInHand[i] = cardsToSet[i];
		}
		this.cardsInHand = newCardsInHand;
		handSize = cardsInHand.length;
	}
}
