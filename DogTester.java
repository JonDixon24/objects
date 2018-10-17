import java.util.Scanner;
public class DogTester {

  public static void main( String[] args ) {

    Scanner input = new Scanner(System.in);

    //Defines whichPet and whichAction For Future Changes
    String whichPet = ""
    String whichAction = ""

    //Creates All Pets
    Dog rover = new Dog("Rover", "Dalmation", 1, 10);
    Dog dog2 = new Dog("Clifford", "Big Red", 2, 15);
    Dog snoopy = new Dog("Snoopy", "Beagle", 3, 20);
    Cat jalapeno = new Cat("Jalapeno", "Ginger Tabby", 11, 10);

    //List All Possible Actions
    public void listActions() {
      System.out.println("Talk");
      System.out.println("Pet");
      System.out.println("Feed");
      System.out.println("Scold");
    }

    //Checks What Action The User Picks
    public void testForAction() {
      System.out.println("What would you like to do with your pets?");
      System.out.println("Your options are:");
      listActions();
      whichAction = input.nextLine();
    }

    //Checks What Pet The Use Picks
    public void testForPet() {
      if (whichAction = "talk" || "Talk") {
        System.out.println("Which pet would you like to talk to?");
        whichPet = input.nextLine();
      }

      if (whichAction = "pet" || "Pet") {
        System.out.println("Which of your pets would you like to pet?");
        whichPet = input.nextLine();
      }

      if (whichAction = "feed" || "Feed") {
        System.out.println("Which pet would you like to feed?");
        whichPet = input.nextLine();
      }

      if (whichAction = "scold" || "Scold") {
        System.out.println("Which pet are you going to scold?");
        whichPet = input.nextLine();
      }
    }

    //Initial Sequence
    System.out.println("Dogs:");
    System.out.println(rover.getName());
    System.out.println(dog2.getName());
    System.out.println(snoopy.getName());
    System.out.println("///////////////////////////");
    System.out.println("Cats:");
    System.out.println(jalapeno.getName());
    System.out.println("///////////////////////////");

  //  rover.sayHi();
  //  System.out.println("-->--<--");
  //  rover.pet();
  //  System.out.println("-->--<--");
  //  rover.pet();
  //  System.out.println("-->--<--");
  //  rover.eat();
  //  System.out.println("-->--<--");

    testForAction();
    testForPet();


    }




  }
}
