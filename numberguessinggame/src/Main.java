import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a random number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int guess = 0;

        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        // Loop until the user guesses the correct number
        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");

            // Check if the input is an integer
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();

                // Provide hints if the guess is incorrect
                if (guess < numberToGuess) {
                    System.out.println("Too low! Try a higher number.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try a lower number.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number!");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Close the scanner
        scanner.close();
    }
}
