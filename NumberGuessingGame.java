import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Random random = new Random();
        
        int maxRange = 100; // Maximum number to guess
        int randomNumber = random.nextInt(maxRange) + 1; // Generate a random number between 1 and maxRange
        int numOfAttempts = 0;
        boolean GuessedCorrectly = false;
        
        System.out.println("Welcome to Guess Number Game!");
        System.out.println("You will be asked to guess a number to win the game");
        System.out.println("you have maximum 5 attempt limit");
        System.out.println(" Guess a number between 1 and " + maxRange );

        while (!GuessedCorrectly && numOfAttempts<5) {
            System.out.print("Enter a guess number between 1 to 100 : ");
            int playerGuess = obj.nextInt();
            numOfAttempts++;

            if (playerGuess == randomNumber) {
                GuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number correctly in " + numOfAttempts + " attempts");
            } else if (playerGuess < randomNumber) {
                System.out.println("your guess number is smaller");
            } else {
                System.out.println("your guess number is larger");
            }
            
        }
        if(!GuessedCorrectly){
            System.out.println("sorry your chances are over.The correct number was "+randomNumber);
     }

        obj.close();
    }
}
