/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card nicksCard = new Card("Queen","Clubs",10);
		Card bobsCard = new Card("Queen", "Clubs", 10);

		System.out.println(bobsCard.toString());
		bobsCard.matches(nicksCard);
		
	}
}
