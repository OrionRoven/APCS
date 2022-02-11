public class Happy {

  public static String happy(Person p){
    String happiness = "";
    if (p.isHappy) {
      happiness = p.name + " is happy";
    } else {
      happiness = p.name + " is sad";
    }
    return happiness;
  }

  public static void main(String[] args) {
    Person nakib = new Person("nakib");
    System.out.println(happy(nakib));
    Person orion = new Person("orion");
    System.out.println(happy(orion));
    Person max = new Person("max");
    System.out.println(happy(max));
  }
}
