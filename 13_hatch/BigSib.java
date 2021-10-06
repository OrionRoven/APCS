/*
Shoulderbuddies (Orion Roven + Michael Shoulderbuddy)
APCS
HW13 - Where do Big Sibs come from?
10/6/21

DISCO:
A constructor is a method that runs any time a the class it is in is mentioned
In this case richard.greet("freshman") is called and instead of immediately running the greet() method,
the program runs the constructor and prints "Word up ", then greets the freshman.
If the constructor just prints "Word up ", then the only thing helloMsg will ever be is Word Up,
but if we want it to be other things (Salutaions or Hey ya), then we must also create a setHelloMsg.

QCC:
Is there a way for the BigSib constructor to print different things depending on the Big Sib that we chose?

*/
public class BigSib {
  private String helloMsg;
  public BigSib () {
    helloMsg="Word up";
  }
  public String greet(String s){
    return helloMsg+' '+s;
  }
  public void setHelloMsg(String x){
    helloMsg=x;
  }
}
