package com.bridgelabz.DeckOfCard;

public class DeckOfCardCards {

	
	private String suit;
	private String rankOfCard;
	
	
	/*********************************************************************************
	 * 
	 * Constructor to initilaize the suit and rankOfCards
	 * 
	 * @param suit -->Integer
	 * @param rank -->Integer
	 * 
	 * ******************************************************************************
	 */
	public DeckOfCardCards(int suit, int rank) {
		this.suit = getSuit(suit);
		this.rankOfCard = getRank(rank);
	}

	/*******************************************************************
	 * 
	 * getter method to get the suit
	 * 
	 * @return String
	 * 
	 * *****************************************************************
	 */
	public String getSuit() {
		return suit;
	}

	/******************************************************************
	 * 
	 * getter method for geting the rank of the card
	 * 
	 * @return String
	 * 
	 * ****************************************************************
	 */
	public String getRank() {
		return rankOfCard;
	}
	
	
	/*********************************************************************
	 * for getting suit name
	 * 
	 * @param  suit
	 * @return String
	 * 
	 * *******************************************************************
	 */
	public String getSuit(int suit) {
		switch(suit)
		{
		case 0 : return "Clubs";
		
		case 1 : return "Diamonds";
		
		case 2 : return "Hearts";

		case 3 : return "Spades";
		
		default : return "Invalid";
		}
	}
	
	
	/************************************************************************
	 * 
	 * for getting card number
	 * 
	 * @param  rank --> Integer 
	 * @return String
	 * 
	 * *************************************************************************
	 */
	public String getRank(int rank) {
		switch(rank)
		{
		case 0 : return("2");
		case 1 : return("3");
		case 2 : return("4");
		case 3 : return("5");
		case 4 : return("6");
		case 5 : return("7");
		case 6 : return("8");
		case 7 : return("9");
		case 8 : return("10");
		case 9 : return("Jack");
		case 10 : return("Queen");
		case 11 : return("King");
		case 12 : return("Ace");
		default : return("Invalid");
		
		}
		
	}
}
