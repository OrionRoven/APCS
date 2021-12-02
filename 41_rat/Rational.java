/*
Team Incredibly Cohesive (Orion Roven, Jaylen Zeng, David Chen)
APCS period 7
HW41 -- Be Rational
12/1/21
time elapsed:

DISCO:
In our toString method, it is necessary to create and empty string and then add the floating-point rational number to because we cannot convert a double to a String
When we say r.multiply(s), in the multiply method, this refers to r and the parameter num refers to s
If we set rational r to x/0, then r defaults to the word Infinity
To fix this, in the overloaded constructor I added a boolean expression where if denom==0 then it prints "bruh y u divide by 0"

QCC:
I thought that there were math errors that happen in java when a number is divided by 0
Why in this case do the numbers divided by 0 become Infinity

*/

public class Rational {
    public int denominator;
    public int numerator;
    public double rational;

    public static void main(String[] args) {
      Rational r = new Rational(2,3);
      Rational s = new Rational(4,5);
      System.out.println(r.rational);
      System.out.println(r.toString());
      System.out.println(r.multiply(s));
      System.out.println(r.divide(s));
    }

    public Rational() {
      denominator = 1;
      numerator = 0;
      rational = floatValue();
    }

    public Rational(int num, int denom) {
      if (denom==0) {
        System.out.println("bruh y u divide by 0");
      }
      numerator = num;
      denominator = denom;
      rational = floatValue();
    }

    public String toString() {
      String str = "";
      str += floatValue();
      return str;
    }

    public double multiply(Rational num) {
      int newNum = this.numerator * num.numerator;
      int newDom = this.denominator * num.denominator;
      return (double)newNum/newDom;
    }

    public double divide(Rational num) {
      int newTop = this.numerator * num.denominator;
      int newBot = this.denominator * num.numerator;
      return (double)newTop/newBot;
    }

    public double floatValue() {
        return (double)(numerator)/denominator;
    }

}
