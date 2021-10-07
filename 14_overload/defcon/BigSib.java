/*
New Trios (Orion Roven + Xinqing Lin) (Ducks: Von Geburt + Horse)
APCS
HW14 - customize your creation
10/7/21

DISCO:
If we make richard an instance in class BigSib, then in default constructor BigSib, if we put the input as String s, then the input of of BigSib richard = new BigSib('hi') is s in the default constructor BigSib
Default constructors can't take paramaters

QCC:

*/

public class BigSib {
  private String helloMsg;
  public BigSib () {
    helloMsg="Good day";
  }
  public String greet(String s){
    return helloMsg+' '+s;
  }
}
