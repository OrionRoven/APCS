public class Rational {
    public int denominator;
    public int numerator;
    public double rational;

    public static void main(String[] args) {
      Rational r = new Rational(2,3);
      System.out.println(r.rational);
      System.out.println(r.toString());
    }

    public Rational() {
        denominator = 1;
        numerator = 0;
        rational = floatValue();
    }

    public Rational(int num, int denom) {
        numerator = num;
        denominator = denom;
        rational = floatValue();
    }

    public String toString() {
      String str = "";
      str += floatValue();
      return str;
    }

    public void multiply(Rational num) {
        int newNum = this.numerator * num.numerator;
        int newDom = this.denominator * num.denominator;
    }

    public void divide(Rational num) {

    }

    public double floatValue() {
        return (double)(numerator)/denominator;
    }

}
