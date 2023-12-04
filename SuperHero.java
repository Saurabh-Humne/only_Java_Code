class SuperHero {
 protected String univers = "DC";
 public void Power() {
  System.out.println("I am Batman");
 }
}

class Hero extends SuperHero {
 private String HeroName = "BATMAN";

 public static void main(String[] args){
  Hero myHero = new Hero();

  myHero.Power();

  System.out.println(myHero.univers + " " + myHero.HeroName);
 }
}