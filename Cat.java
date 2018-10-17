public class Cat {

  //Properties
  String name;
  String breed;
  int tagNumber;
  int happiness;
  int scoldSinceLastMeal = 0;

  //Constructors
  public Cat(String name, String breed, int tagNumber, int happiness) {
    this.name = name;
    this.breed = breed;
    this.tagNumber = tagNumber;
    this.happiness = happiness;
  }

  //Abilities
  public void meow() {
    System.out.println("Meow!");
  }

  public void sayHi() {
    meow();
    System.out.println("My name is " + this.name);
  }

  public void pet() {
    happiness = happiness / 2;
    System.out.println("You pet " + this.name);
    System.out.println("But " + this.name + " hated it, and now has a happiness of " + this.happiness + "%");
  }

  public void scold() {
    happiness += 5;
    scoldSinceLastMeal += 1;
    System.out.println("You scold " + this.name);
    System.out.println("" + this.name + " seems to shrug, and walks away happier.");
    System.out.println("" + this.name + " now has a happiness of " + this.happiness + "%");
  }

  public void eat() {
    if (scoldSinceLastMeal >= 3) {
      happiness += 15;
      System.out.println("" + this.name + " has eaten food");
      System.out.println("" + this.name + "'s happiness is now " + this.happiness + "%");
    }

    else {
      System.out.println("" + this.name + " has eaten food");
      System.out.println("However, " + this.name + " has not been scolded enough for their liking.");
      System.out.println("" + this.name + " has not become happier.");
    }
  }



  //Getters
  public String getName() {
    return this.name;
  }

  public String getBreed() {
    return this.breed;
  }

  public int getTagNumber() {
    return this.tagNumber;
  }

  public int getHappiness() {
    return this.happiness;
  }


  //Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public void setTagNumber(int tagNumber) {
    this.tagNumber = tagNumber;
  }

  public void setHappiness(int happiness) {
    this.happiness = happiness;
  }


}
