import java.util.ArrayList;
import java.util.Scanner;
/**
 * The framework for the Celebrity Game project
 *
 * @author cody.henrichsen
 * @version 2.3 25/09/2018 refactored the prepareGame and play methods
 */
public class CelebrityGame
{
	/**
	 * A reference to a Celebrity or subclass instance.
	 */
	private Celebrity _gameCeleb;

	/**
	 * The GUI frame for the Celebrity game.
	 */

	/**
	 * The ArrayList of Celebrity values that make up the game
	 */
	private ArrayList<Celebrity> _hat;

	private Scanner _scanner;

	/**
	 * Builds the game and starts the GUI
	 */
	public CelebrityGame()
	{
		System.out.println("Hello and welcome to celebrity!!!");
		_hat = new ArrayList<Celebrity>();
		_scanner = new Scanner(System.in);
	}

	/**
	 * Prepares the game to start by re-initializing the celebGameList and having the gameFrame open the start screen.
	 */
	/*
	We keep asking the user to input the name and clue for a celeb, until the user passes an empty string for the celebrity name.
	Each celebrity gets added to the _hat.
	*/
	public void prepareGame()
	{
		String name = "NOT EMPTY";
		String clue = "";
		Celebrity c;
		_hat = new ArrayList<Celebrity>();
		System.out.println("Enter the names and clues for celebrities. Once you are done, create a blank celebrity.");
		while (!name.equals("")) {
			System.out.println("Enter the celebrity name (blank to exit): ");
			name = _scanner.next();
			System.out.println("Enter the clue for the celebrity: ");
			clue = _scanner.next();
			addCelebrity(name, clue, "");
		}
		//Shuffles the hat:
		for (int i = 0;i< _hat.size(); i++) {
			c = _hat.remove((int)(_hat.size()*Math.random())); //Removes from a random location
			_hat.add(c); //Moves it to the end
		}
	}

	/**
	 * Determines if the supplied guess is correct.
	 *
	 * @param guess
	 *            The supplied String
	 * @return Whether it matches regardless of case or extraneous external
	 *         spaces.
	 */
	public boolean processGuess(String guess)
	{
		boolean matches = false;

		if (guess.trim().equalsIgnoreCase(_gameCeleb.getAnswer())) {
			matches = true;
			_hat.remove(0);
			if (_hat.size() > 0) {
				_gameCeleb = _hat.get(0);
			}
		}

		return matches;
	}

	/**
	 * Asserts that the list is initialized and contains at least one Celebrity.
	 * Sets the current celebrity as the first item in the list. Opens the game
	 * play screen.
	 */
	public void play()
	{
		long initTime;
		String userGuess;
		prepareGame(); //Sets up the celebrities
		if (_hat.size() > 0) {
			_gameCeleb = _hat.get(0);
		}
		while (_hat.size() > 0){
			System.out.println("Here is your clue: " + sendClue());
			initTime = System.currentTimeMillis(); //Starts the clock
			while (initTime + 60_000 > System.currentTimeMillis())
			{
				System.out.println("Who is it? ");
				userGuess = _scanner.next();
				if (processGuess(userGuess)) {
					break;
				}
			}
			if (initTime + 60_000 > System.currentTimeMillis()) {
				System.out.println("Wow! You got the right answer in under a minute! Get ready, here's the next one!");
			}
			else {
				System.out.println("Not this time! Here's the next one: ");
			}
		}
	}

	/**
	 * Adds a Celebrity of specified type to the game list
	 *
	 * @param name
	 *            The name of the celebrity
	 * @param guess
	 *            The clue(s) for the celebrity
	 * @param type
	 *            What type of celebrity
	 */
	public void addCelebrity(String name, String guess, String type)
	{
		if (validateCelebrity(name) && validateClue(guess, "")){
			_hat.add(new Celebrity(name, guess));
		}
	}

	/**
	 * Validates the name of the celebrity. It must have at least 4 characters.
	 * @param name The name of the Celebrity
	 * @return If the supplied Celebrity is valid
	 */
	public boolean validateCelebrity(String name)
	{
		return name.length() >= 4;
	}

	/**
	 * Checks that the supplied clue has at least 10 characters or is a series of clues
	 * This method would be expanded based on your subclass of Celebrity.
	 * @param clue The text of the clue(s)
	 * @param type Supports a subclass of Celebrity
	 * @return If the clue is valid.
	 */
	public boolean validateClue(String clue, String type)
	{
		return clue.length() >= 10;
	}

	/**
	 * Accessor method for the current size of the list of celebrities
	 *
	 * @return Remaining number of celebrities
	 */
	public int getCelebrityGameSize()
	{
		return _hat.size();
	}

	/**
	 * Accessor method for the games clue to maintain low coupling between
	 * classes
	 *
	 * @return The String clue from the current celebrity.
	 */
	public String sendClue()
	{
		return _gameCeleb.getClue();
	}

	/**
	 * Accessor method for the games answer to maintain low coupling between
	 * classes
	 *
	 * @return The String answer from the current celebrity.
	 */
	public String sendAnswer()
	{
		return _gameCeleb.getAnswer();
	}
}
