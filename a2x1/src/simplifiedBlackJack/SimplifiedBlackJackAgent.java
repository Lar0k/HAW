package simplifiedBlackJack;


import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;

import java.util.Scanner;


/**
 * Simplified Black Jack Agent - see task
 * 
 * @author  (Laurin) 
 * @version (2024-05-07)
 */

public class SimplifiedBlackJackAgent {

	/**
	 * "Play" Black Jack
	 */
	public void playBlackJack(){
		
		//Declaring (initializing) needed variables
		Deck deck = new Deck();
		Card card;
		int points = 0, dealerspoints = 0;
		Scanner sc = new Scanner(System.in);
		char userInput;
		boolean goAhead = false;

		//Dealer's first card
		card = deck.deal();
		dealerspoints = dealCard(card, deck);

		//Printing out Dealer's first card
		System.out.printf("Dealer's first ");
		printRound(card, dealerspoints);
		System.out.printf("\n \n");

		//Loop for the player's game
		do {
			card = deck.deal();
			points += dealCard(card, deck); //Add card value to total points
			printRound(card, points);

			//Control structure for the player's action
			goAhead = false;
			if (points < 21) {
				System.out.printf("Hit (h) or Stand (s)? \n -> ");
				userInput = sc.nextLine().charAt(0);
				if (userInput == 'h') 
					goAhead = true;
				else if (userInput == 's') 
					goAhead = false;
				else 
					assert userInput == 'h' || userInput == 's' : "Invalid Input";
			}//if()
		}while ( points < 21 &&  goAhead == true);  //repeat until (points are 21+ or) the player stands

		//Busted? Otherwise, run the rest of the code
		if (points > 21) {
			System.out.printf("PLAYER LOST \n");
		}
		else { 
			//Dealer's turn
			System.out.printf("\nDealer's Turn: \n");
			do {
				card = deck.deal();
				dealerspoints += dealCard(card, deck);
				printRound(card, dealerspoints);
			}while(dealerspoints < 17);

			//Conclusion
			if (points == dealerspoints) 
				System.out.printf("\nTIE \n");
			else if (points > dealerspoints)
				System.out.printf("\nPLAYER WON \n");
			else if (points < dealerspoints)
				System.out.printf("\nPLAYER LOST \n");
		}//if-else()

		sc.close();
		System.out.flush();
	}//method()

	//Method to determine a card's value
	public int dealCard(Card card, Deck deck) {
		int points = 0;
		switch (card.getRank()) {
			case TWO: points = 2; break;
			case THREE: points = 3; break;
			case FOUR: points = 4; break;
			case FIVE: points = 5; break;
			case SIX: points = 6; break;
			case SEVEN: points = 7; break;
			case EIGHT: points = 8; break;
			case NINE: points = 9; break;
			case TEN:
			case JACK:
			case QUEEN:
			case KING: points = 10; break;
			case ACE: points = 11; break;
			default: System.out.printf("Something went wrong..."); points = 0;
		}//switch()
		return points;
	}//method()

	//Unnecessary grammar structure, printing out points and the card
	public void printRound(Card card, int points) {
		if (card.getSuit().name().equals("SPADES"))
			System.out.printf("Card: %s of %s      Points: %d \n", card.getRank().name(), card.getSuit().name(), points);		
		else
			System.out.printf("Card: %s of %sS      Points: %d \n", card.getRank().name(), card.getSuit().name(), points);
	}//method()

}//class
