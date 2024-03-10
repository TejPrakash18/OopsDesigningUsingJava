package Projects.NumberGuessingGame;

import java.util.Scanner;

class NumberGuessing {
    private int randomNumber;
    private boolean hasWon;
    public NumberGuessing() {
        this.randomNumber = (int) (Math.random() * 100) + 1;
        this.hasWon = false;
    }
    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (!hasWon) {
            System.out.print("Guess a number between 1 and 100: ");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                hasWon = true;
            }
        }
        scanner.close();
    }
}
public class NumberGuessingGame {
    public static void main(String[] args) {
        NumberGuessing game = new NumberGuessing();
        game.play();
    }
}
