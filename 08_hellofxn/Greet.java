/*Orion Roven
APCS
HW08 08_hellofxn
9-30-21

discoveries:
	java requires you to assign a variable to a string.
	If you say greet(String), it returns an error
	If you say greet(String x), then x represents the inputted string and no errors happen

My program works, but I don't really understand why because I called the function greet before I defined it.
Does java not work like other languages in this way?
*/
public class Greet {
	public static void main(String[] args) {
		greet("Moe");
		greet("Larry");
		greet("Curly");
	}
	public static void greet(String x) {
		System.out.println("Well hello there "+x+". What it do homie?");
	}
}
