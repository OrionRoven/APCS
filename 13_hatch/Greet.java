public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    BigSib charlie = new BigSib();
    BigSib harry = new BigSib();
    BigSib oliver = new BigSib();


    greeting = richard.greet("freshman");
    System.out.println(greeting);

    charlie.setHelloMsg("Salutations");
    greeting = charlie.greet("Dr. Spaceman");
    System.out.println(greeting);

    harry.setHelloMsg("Hey ya");
    greeting = harry.greet("Kong Fooey");
    System.out.println(greeting);

    oliver.setHelloMsg("Sup");
    greeting = oliver.greet("mom");
    System.out.println(greeting);

  } //end main()
} //end Greet
