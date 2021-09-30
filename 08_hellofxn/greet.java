//Augment main() to greet 3 hardcoded persons of interest.
//What does this mean?

   
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