package com.bridgelabz.DeckOfCard;

import java.util.Random;

import com.bridgelabz.utility.Queue;


/*****************************************************************************************************************************
 * 
 * To play the card game between four players and is to be noticed that all the players get different and unique card
 * the deck is to be shuffled each time before the player gets the card
 * 
 * @author 	Amresh Kumar
 * @since 	6-12-2019
 * @version	1.0
 *
 ******************************************************************************************************************************
 */
public class DeckOfCardQueue {

	

	// creating object of Queue which is implemented in this program to store the player
	Queue<DeckOfCardPlayer> deckOfCardPlayerQueue = new Queue<DeckOfCardPlayer>();

	int[][] DEckOfCardArray = new int[4][13]; 

	
	public static void main(String[] args) {
		DeckOfCardQueue deckOfCardQueueObject = new DeckOfCardQueue();
		deckOfCardQueueObject.add();
		deckOfCardQueueObject.dequeueDeckOfCardPlayers();
	}
	
	
/****************************************************************************
 * To assign the card
 * 
 * 
 * @param null
 * @return void
 * 
 * **************************************************************************
 */
	public void add() {
		//Loop will flow till four time since there are four tpyes of card
		for (int cardTypeCount = 1; cardTypeCount <= 4; cardTypeCount++) {
			assignCards();
		}
	}

	/****************************************************************************
	 * 
	 * define function to assign cards to players
	 * 
	 * @param  null
	 * @return void
	 * 
	 * **************************************************************************
	 */
	public void assignCards() {
		DeckOfCardPlayer player = new DeckOfCardPlayer();
		
		//loop is running till 9 times since all the players should get 9 cards each
		for (int cardAssignCount = 0; cardAssignCount < 9; cardAssignCount++) {
			shuffleCards(player);
		}
		player.enQueueCards();
		deckOfCardPlayerQueue.enQueue(player);
	}

	/****************************************************************************************************************
	 * 
	 * To shuffle all the cards and distribute to each player
	 * In playing card shuffeling is one of the major task so that every time players get different cards 
	 * 
	 * @param 	player --> DeckOfCardPlayer
	 * @return 	void
	 * 
	 * ***************************************************************************************************************
	 */
	public void shuffleCards(DeckOfCardPlayer player) {
		//creating random object 
		Random random = new Random();
		int suit = random.nextInt(4);
		int rank = random.nextInt(13);
		//checking if cardsArray is not 0
		if (DEckOfCardArray[suit][rank] != 0) {
			shuffleCards(player);

		} else {
			player.addCard(suit, rank);
			DEckOfCardArray[suit][rank] = 1;
		}
	}

	/***************************************************************
	 * 
	 *To dequeue players from the queue 
	 *
	 *@param  null
	 *@return void
	 *
	 ***************************************************************
	 */
	public void dequeueDeckOfCardPlayers() {
		
		//Loop will work 4 time since there are only 4 players
		for (int playerDequeueCounter = 1; playerDequeueCounter <= 4; playerDequeueCounter++) {
			
			DeckOfCardPlayer player = deckOfCardPlayerQueue.deQueue();
			System.out.println("Player " + playerDequeueCounter + " card's:");
			printDeckOfCardPlayersCards(player);//calling printDeckOfCardPlayersCards() to print the cards of player

		}
	}

	/*************************************************************************************
	 * 
	 * 
	 * To print each player cards what they have got in the play
	 * 
	 * @param  player --> {@link DeckOfCardPlayer}
	 * @return void
	 * 
	 * ***********************************************************************************
	 */
	public void printDeckOfCardPlayersCards(DeckOfCardPlayer player) {
		
		//loop work till 9 times as each players has only 9 cards
		for (int cardCounter = 0; cardCounter < 9; cardCounter++) {
			DeckOfCardCards card = player.getCard();
			System.out.print(card.getSuit() + " : " + card.getRank() + "\t"); //prints each card
		}
		System.out.println("\n");
	}
}
