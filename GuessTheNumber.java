package prodigy;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound);

        int userGuess;
        int attempts = 0;

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
            }
        } while (userGuess != randomNumber);

        scanner.close();
    }

}
