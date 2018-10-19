import java.util.Scanner;
public class DogTester {

  public static void main( String[] args ) {

    Scanner input = new Scanner(System.in);

    //Defines whichPet and whichAction For Future Changes
    String whichPet = "";
    String whichAction = "";

    //Creates All Pets
    Dog rover = new Dog("Rover", "Dalmation", 1, 10);
    Dog dog2 = new Dog("Clifford", "Big Red", 2, 15);
    Dog snoopy = new Dog("Snoopy", "Beagle", 3, 20);
    Cat jalapeno = new Cat("Jalapeno", "Ginger Tabby", 11, 10);

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

  System.out.println("What would you like to do with your pets?");
  System.out.println("Your options are:");
  System.out.println("Talk");
  System.out.println("Pet");
  System.out.println("Feed");
  System.out.println("Scold");
  whichAction = input.nextLine();
  System.out.println("OK.");
  if (whichAction == "talk") {
    System.out.println("Which pet would you like to talk to?");
    whichPet = input.nextLine();
  }

  if (whichAction == "pet") {
    System.out.println("Which of your pets would you like to pet?");
    whichPet = input.nextLine();
  }

  if (whichAction == "feed") {
    System.out.println("Which pet would you like to feed?");
    whichPet = input.nextLine();
  }

  if (whichAction == "scold") {
    System.out.println("Which pet are you going to scold?");
    whichPet = input.nextLine();
  }






  }
}
