/**

 * Card.java

 *

 * <code>Card</code> represents a playing card.

 */

public class Card {



	/**

	 * String value that holds the suit of the card

	 */

	private String suit;



	/**

	 * String value that holds the rank of the card

	 */

	private String rank;



	/**

	 * int value that holds the point value.

	 */

	private int pointValue;





   /**

	 * Creates a new <code>Card</code> instance.

	 *

	 * @param cardRank  a <code>String</code> value

	 *                  containing the rank of the card

	 * @param cardSuit  a <code>String</code> value

	 *                  containing the suit of the card

	 * @param cardPointValue an <code>int</code> value

	 *                  containing the point value of the card

	 */

	public Card(String cardRank, String cardSuit, int cardPointValue) {

		suit = cardSuit;

		rank = cardRank;

		pointValue = cardPointValue;

	}





	/**

	 * Accesses this <code>Card's</code> suit.

	 * @return this <code>Card's</code> suit.

	 */

	public String suit() {

		return this.suit;

   }



	/**

	 * Accesses this <code>Card's</code> rank.

	 * @return this <code>Card's</code> rank.

	 */

	public String rank() {

		return this.rank;

	}



   /**

	 * Accesses this <code>Card's</code> point value.

	 * @return this <code>Card's</code> point value.

	 */

	public int pointValue() {

		return this.pointValue;

	}



	/** Compare this card with the argument.

	 * @param otherCard the other card to compare to this

	 * @return true if the rank, suit, and point value of this card

	 *              are equal to those of the argument;

	 *         false otherwise.

	 */

	public boolean matches(Card otherCard) {

		if (!(otherCard.rank().equals(  this.rank()))) {

			return false;

		}

		if (!(otherCard.suit().equals(  this.suit()))) {

			return false;

		}

		if (!(otherCard.pointValue() == this.pointValue())) {

			return false;

		}

		return true;



	}



	/**

	 * Converts the rank, suit, and point value into a string in the format

	 *     "[Rank] of [Suit] (point value = [PointValue])".

	 * This provides a useful way of printing the contents

	 * of a <code>Deck</code> in an easily readable format or performing

	 * other similar functions.

	 *

	 * @return a <code>String</code> containing the rank, suit,

	 *         and point value of the card.

	 */

	@Override

	public String toString() {

		return this.rank() + " of " + this.suit() + " (point value = " + this.pointValue + ")";

	}

}






/**

 * This is a class that tests the Card class.

 */

public class CardTester {



	/**

	 * The main method in this class checks the Card operations for consistency.

	 *	@param args is not used.

	 */

	public static void main(String[] args) {

		Card Oscar = new Card("king", "spades", 13);

		Card Max = new Card("two", "clubs", 2);

		Card Orion = new Card("king", "spades", 13);



		System.out.println(Oscar.rank());

		System.out.println(Oscar.suit());

		System.out.println(Oscar.pointValue());

		System.out.println(Oscar);



		System.out.println(Max.rank());

		System.out.println(Max.suit());

		System.out.println(Max.pointValue());

		System.out.println(Max);



		System.out.println(Orion.rank());

		System.out.println(Orion.suit());

		System.out.println(Orion.pointValue());

		System.out.println(Orion);



		System.out.println("Max is a conformist: " + Max.matches(Oscar));

		System.out.println("Orion is a conformist: " + Orion.matches(Oscar));



	}

}
