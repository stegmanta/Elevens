/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] bRanks = {"8","6"};
		String[] bSuits = {"Diamonds","Clubs"};
		int[] bValues = {8,6};

		Deck b = new Deck(bRanks,bSuits,bValues);
		// System.out.println(b.isEmpty());
		// System.out.println(b.size());
		System.out.println(b.deal());
		

	}
}
