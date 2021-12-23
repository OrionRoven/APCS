public class Driver {
  public static void main(String[] args) {
    //compareTo Test Cases
    System.out.println("Testing compareTo \n");
    Rational stillDavid = new Rational(5, 8);
    Rational jaylen = new Rational(10,16);
    Rational orion = new Rational(7,8);
    String freshman = new String("Thinkeren");
    System.out.println(stillDavid.compareTo(jaylen)); //should return 0;
    System.out.println(jaylen.compareTo(orion));
    System.out.println(orion.compareTo(stillDavid));
    System.out.println(orion.compareTo(freshman));
    //.equals test cases
    System.out.println("Testing .equals \n");
    Rational timmy = new Rational(2,4);
    Rational tommy = new Rational(4,8);
    Rational tammy = new Rational(5,8);
    String tim = new String("Imposter");
    System.out.println(timmy.equals(tommy));
    System.out.println(tommy.equals(timmy));
    System.out.println(timmy.equals(tammy));
    System.out.println(tammy.equals(tommy));
    System.out.println(timmy.equals(tim));
    System.out.println(tim.equals(tommy));
  }
}
