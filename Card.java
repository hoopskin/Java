public class Card{
	//Suits
	public static final int SPADE = 1;
	public static final int HEART = 2;
	public static final int CLUB = 3;
	public static final int DIAMOND = 4;

	//Rank
	public static final int ACE = 1;
	//2-10 are their int.
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	private int cardSuit, cardRank;

	public Card(int cardSuit, int cardRank) {
		this.cardSuit = cardSuit;
		this.cardRank = cardRank;
	}

	public int getCardRank() {
		return cardRank;
	}

	public int getCardSuit() {
		return cardSuit;
	}
}