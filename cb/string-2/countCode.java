public class countCode {
  public static int countCode(String str) {
    int counter=0;
    for (int i=0; i<str.length()-3; i++){
      char checkE=str.charAt(i+3);
      if (str.substring(i,i+2).equals("co") && checkE=='e') {
        counter++;
      }
    }
    return counter;
  }

  public static void main(String[] args){
    System.out.println(countCode("aaacodebbb"));
    System.out.println(countCode("codexxcode"));
    System.out.println(countCode("cozexxcope"));
  }
}
