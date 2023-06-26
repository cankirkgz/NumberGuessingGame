import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNum = random.nextInt(101); // Generate a random number between 0 and 100
        int guess;
        int guessCount = 0;
        boolean correctGuess = false;

        System.out.println("Guess a number between 0 and 100.");

        while (!correctGuess) {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();
            guessCount++;

            if (guess == randomNum) {
                correctGuess = true;
                System.out.println("Congratulations! You guessed " + guess + " correctly in " + guessCount + " tries.");
            } else if (guess < randomNum) {
                System.out.println("Guess a higher number.");
            } else {
                System.out.println("Guess a lower number.");
            }
        }
    }
}
