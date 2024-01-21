// import the scanner class which will allow us to get input from the user
import java.util.Scanner;

// Create a class called starbase13, note that the class name must match the file name
public class starbase13 {
    public static String getWelcomeMessage(String userName) {
        return "\n\nWelcome " + userName + " to Starbase 13!\n\n";
    }
    // Create our main method, this is where the program will start always!
    public static void main(String[] args){
        // Create a welcome output to our user
        System.out.println("\nWelcome to Starbase 13, the luckiest starbase in the galaxy!");
        // Greet the user and ask for their name
        System.out.println("What is your name?");
        // Create a string variable to hold the user's name
        String userName = "";
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        //Get the user's name and store it in the userName variable
        userName = scanner.nextLine();
        // Great the user by name
        System.out.println("\n\nWelcome " + userName + " to Starbase 13!\n\n");
         // Close the scanner to avoid resource leak
        scanner.close();
        } //End of the main method
    } //This is the last line of the program, nothing after this line will be executed