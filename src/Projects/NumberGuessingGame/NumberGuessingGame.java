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

// Problem statement : Number Guessing Game
// Rule : One player think a number between a predefined range (e.g. 1-100) guessed = 20
// and the other player tries to guess it. // 25 too high , 15 too low , 20 correct
// After each guess the other player provide feedback whether the guess
// is too high, too low or correct

//Requirements :
//  1. create a command line application
//  2. Provide feedback
//  3. Initialize the game with a random number within predefined range
//  4. End the game when the correct number is guessed

// Input Type : Integer Number.

// Solution

// 2 variable, player(guessed number), random number
// condition checked by the "if-else" statements
// 1 variable, when to run your game , starting mai marks false , when the guess correct exit the game (true)





