public class Student {
  private int Charms;
  private int Potions;
  private int Herbology;
  private static double GPA;
  private static double newGPA;
  public Student(){
    Charms=94;
    Potions=93;
    Herbology=95;
  }
  public static double calcGPA(double Charms, double Potions, double Herbology){
    newGPA=(Charms+Potions+Herbology)/3.0;
    GPA=newGPA;
    return GPA;
  }
  public static void main(String[] args){
    System.out.println(calcGPA(94.0,93.0,96.0));
  }
}
