import java.util.Scanner;

/**
 * Greets user and calculates their approximate age
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in);
   
    // Ask the user for their name
    System.out.println("Please enter your name:");
    
    //declare variable to store name of the user
    String name;

    //get input for users name
    name = input.nextLine();

    //greet the user
    System.out.println("Hello " + name + "!");

    //declare and initialize current year constant
    final int CURRENT_YEAR = 2020;

    //prompt the user to enter their birth year
    System.out.println("Please enter the year you were born:");

    //get the users birthyear
    int birthyear = input.nextInt();

    //calculate the approximate age
    int age = CURRENT_YEAR - birthyear;

    //tell user their approximate age
    System.out.println("You are " + age + " years old!");
  }
}
