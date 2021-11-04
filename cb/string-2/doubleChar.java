<<<<<<< HEAD
public class doubleChar{
	public String doubleChar(String str) {
	  String output="";
	  for (int place=0; i<str.length(); i++){
	    thing=thing+str.charAt(place)+str.charAt(place);
	  }
	  return output;
	}
=======
public class doubleChar {
  public String doubleChar(String str) {
    String output="";
    for (int place=0; place<str.length(); place++){
      output=output+str.charAt(place)+str.charAt(place);
    }
    return output;
  }
  public static void main(String[] args) {
    System.out.println(doubleChar("The"));
  }
>>>>>>> 223c273918d0c7a4ea1c976f08b18d9da46d6c62
}
