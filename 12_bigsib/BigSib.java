/*
Orion Roven + Michael Shoulderbuddy
APCS
HW12 BigSib richard
10/5/21

DISCO:
Variables created before methods in a class are called instance variables
System.out.println prints and then makes a new line whereas System.out.print prints and doesn't make a new line

QCC:
I successfully printed "Hello freshman" with the original Greet.java, but in order to print Salutation Dr. Spaceman, I added some stuff to Greet.java.
Is that ok?

*/

public class BigSib{
  String helloMsg;
  public void setHelloMsg(String s){
    helloMsg=s;
    System.out.print(helloMsg+' ');
  }
  public static String greet(String x){
    return x;
  }
}
