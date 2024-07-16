import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\nWelcome to the Number Guessing Game!");

        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int max_attempts = 10;


            while (attempts < max_attempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();

                attempts++;

                if (userGuess == number) {
                    System.out.println("Congratulations! You guessed the correct number " + number + " in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < number) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }
            if (attempts >= max_attempts) {
                System.out.println("\nSorry!! You have used up all your attempts. The number is " + number + ".\n");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String play_again = scanner.nextLine();
            playAgain = "yes".equals(play_again);
            System.out.println("-------------------------------------------------");

        }

        System.out.println("\n\tGame over! Your final score: " + score);
        System.out.println("-------------------------------------------------");

        scanner.close();
    }
}
