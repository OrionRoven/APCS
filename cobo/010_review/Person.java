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
