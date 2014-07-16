import java.util.*;

public class Deck{
	private Stack deck = new Stack();
	private final int deckSize = 52;

	public deck(int numOfDecks){
		deck = new Card[numOfDecks*deckSize];
		int index = 0;

		for (int i = 0 ; i < numOfDecks ; i++) {
			for (int j = 1 ; j < 5 ; j++) {
				for (int k = 1 ; k < 14 ; k++) {
					deck.push(new Card[j,k]);
				}
			}
		}
	}
	public deck() {
		this.deck(1);
	}

	public shuffle() {
		Collections.shuffle(deck);
	}
}