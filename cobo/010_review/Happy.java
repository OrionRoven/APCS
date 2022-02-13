// Standard Duo Configuration: Orion Roven, Nakib Abedin, Max Schneider
// APCS period 8
// Lab06 -- Read/Review/Expand
// 2022-2-14
// time elapsed: 3.7 hrs

public class Happy {
  String happy = " is happy";
  String sad = " is sad";

  public static String happy(Person p){
    String happiness = "";
    if (p.isHappy) {
      happiness = p.name + happy.substring(0);
    } else {
      happiness = p.name +  sad.substring(0);
    }
    return happiness;
  }

  public static int howHappy(int iterations, Person p){
    // will run test if someone is happy for a specified number of iterations and will return how happy they are
    // if they are happier on average, the output will be 1, sadder on average, the output will be 1.
    // if they are equally happy and sad then output will be 0
    int output = 0;

    while(iterations > 0){
      if(p.isHappy){
        output += 1;
      }else{
        output -= 1;
      }
      iterations--;
    }

    if(output > 0 && output != 0){
      return 1;
    }else if (output < 0 && output != 0){
      return -1;
    }else{
      return 0;
    }
  }

  public static void main(String[] args) {
    Person nakib = new Person("nakib");
    System.out.println(howHappy(10, nakib));
    Person orion = new Person("orion");
    System.out.println(happy(orion));
    Person max = new Person("max");
    System.out.println(happy(max));
  }
}
