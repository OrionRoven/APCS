/*
New Trios (Orion Roven + Xinqing Lin) (Ducks: Von Geburt + Horse)
APCS
HW14 - customize your creation
10/7/21

DISCO:
If we make richard an instance in class BigSib, then in default constructor BigSib, if we put the input as String s, then the input of of BigSib richard = new BigSib('hi') is s in the default constructor BigSib
Overload constructors can have paramaters (input)
In this program the parameter for the overload constructor is (String s)

QCC:
If a constructor has paramaters, is it necessarily an overload constructor?

*/

public class BigSib {
  private String helloMsg;
  public BigSib (String s) {
    helloMsg=s;
  }
  public String greet(String s){
    return helloMsg+' '+s;
  }
}
