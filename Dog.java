public class Dog {

  //Properties
  String name;
  String breed;
  int tagNumber;
  int happiness;
  boolean petSinceLastMeal = false;

  //Constructor(s)
  public Dog(String name, String breed, int tagNumber, int happiness) {
    this.name = name;
    this.breed = breed;
    this.tagNumber = tagNumber;
    this.happiness = happiness;
  }

  //Abilities

  //Bark -> Woof!
  public void bark() {
    System.out.println("Woof!");
  }

  //Say Hi -> Barks, My name is (name)
  public void sayHi() {
    bark();
    System.out.println("My name is " + this.name);
  }

  //Pet -> Increase Happiness
  public void pet() {
    happiness += 10;
    petSinceLastMeal = true;
    System.out.println("You pet " + this.name);
    System.out.println("" + this.name + " now has a happiness of " + this.happiness + "%");
  }

  //Eat -> Eat & Increase Happiness
  public void eat() {
    if (this.happiness < 25) {
      System.out.println("" + this.name + " is not happy enough to eat.");
    }

    else {
      System.out.println("" + this.name + " has eaten food.");

      if (petSinceLastMeal) {
        happiness += 15;
        System.out.println("" + this.name + "'s happiness is now " + this.happiness + "%");
      }

      else {
        System.out.println("" + this.name + " has eaten food.");
        System.out.println("However, " + this.name + " has not been pet since their last meal.");
        System.out.println("Your dog's happiness did not increase.");
      }
    }
  }

  //Scold -> Decrease Happiness
  public void scold() {
    happiness -= 20;
    System.out.println("You scold " + this.name + ".");
    System.out.println("" + this.name + " pouts and loses 20% happiness.");
    System.out.println("" + this.name + "'s happiness is now " + this.happiness + "%");
  }



  //Getter
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

  //Setter
  public void setName(String name) {
    this.name = name;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public void setTagNumber(int tagNumber) {
    if (tagNumber < 0) return;

    this.tagNumber = tagNumber;
  }

  public void setHappiness(int happiness) {
    this.happiness = happiness;
  }


}
