package com.bridgelabz.DeckOfCard;
/*********************************************************************************************
 * 
 * Contains a Main method to see the players different card
 * 
 * @author Amresh Kumar
 * @since  6-12-2019
 * 
 ********************************************************************************************
 */
public class DeckOsCardView {
	//main method to perform the task
		public static void main(String[] args) {
			
			//creating the DeckOfCards Object 
		    DeckOfCard deckOfCardsObject = new DeckOfCard();
			int DeckOfCardPlayer;
			
			// loop will run four times since there are four players
			for(DeckOfCardPlayer = 1; DeckOfCardPlayer <= 4;DeckOfCardPlayer++)
			{
				deckOfCardsObject.assignCards(DeckOfCardPlayer);
				System.out.println("Player "  + DeckOfCardPlayer + " card's:");
				deckOfCardsObject.printDeckOfCard(DeckOfCardPlayer);
			}
		}	
}
