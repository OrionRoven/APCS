import java.util.Scanner;

public class DegreeConvert {
  public static void main (String[] args){
    double degCel;
    double degFar;
    Scanner in = new Scanner(System.in);

    //read input
    System.out.print("What is the temperature in degrees celsius? ");
    degCel=in.nextDouble();

    //change to degrees faranheight
    degFar=((degCel*(9.0/5.0))+32);
    System.out.println(degCel+"˚C = "+degFar+"˚F");
  }
}
