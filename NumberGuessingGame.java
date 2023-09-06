import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);
        int userGuess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have select a number between 1 and 100.");

        while (true) {
            System.out.print("Enter your number: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == number) {
                System.out.println("You guessed the number " + number + " in " + attempts + " attempts.");
                break;
            } else if (userGuess < number) {
                System.out.println("Try again! Your guess is too low.");
            } else {
                System.out.println("Try again! Your guess is too high.");
            }
        }

       
    }
}