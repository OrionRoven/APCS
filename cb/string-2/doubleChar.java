public class doubleChar {
  public String doubleChar(String str) {
    String output="";
    for (int place=0; place<str.length(); place++){
      output=output+str.charAt(place)+str.charAt(place);
    }
    return output;
  }
}
