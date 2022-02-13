// Standard Duo Configuration: Orion Roven, Nakib Abedin, Max Schneider
// APCS period 8
// Lab06 -- Read/Review/Expand
// 2022-2-14
// time elapsed: 3.7 hrs

public class Person {
  double happinessLvl;
  boolean isHappy;
  String name;

  public Person(String nombre){
    this.name = nombre;
    this.happinessLvl = Math.random();
    if (happinessLvl > 0.5){
      this.isHappy = true;
    }else{
      this.isHappy = false;
    }

  }
}
