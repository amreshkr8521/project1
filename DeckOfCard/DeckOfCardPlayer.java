package com.bridgelabz.DeckOfCard;

import com.bridgelabz.utility.Queue;

public class DeckOfCardPlayer {

	
	//creating object of Queue of Cards type
		Queue<DeckOfCardCards> deckOfCardQueue = new Queue<DeckOfCardCards>();
		int[][] deckOfcardArray= new int[4][13];      //2D array
		
	    /**
	     * define function to add card in 2D array
	     * @param suit
	     * @param rank
	     */
		public void addCard(int suit, int rank) {
			deckOfcardArray[suit][rank] = 1;
		}
		
		/***********************************************************************************
		 *  to get card from queue
		 * 
		 * @param  null
		 * @return DeckOfCardCards 
		 * 
		 * **********************************************************************************
		 */
		public DeckOfCardCards getCard() {
			return deckOfCardQueue.deQueue();
		}
		
		/*************************************************************************************
		 *  
		 * To enqueues all the cards in ascending order 
		 * 
		 * @return void
		 * 
		 *  **********************************************************************************
		 */
		public void enQueueCards() {
			//loop runs four times since there are four types of cards
			for (int suit = 0; suit < 4; suit++) {
				//loop runs 13 time since there are 13 card of each type
				for (int rank = 0; rank < 13; rank++) {
					if(deckOfcardArray[suit][rank] == 1) 
						deckOfCardQueue.enQueue(new DeckOfCardCards(suit, rank));									
				}			
			}
		}
		
}
