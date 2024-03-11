package Projects.RockScissorPaper;

import java.util.Random;
import java.util.Scanner;

class Player {
    private String name;
    private int score;
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }

    public void resetScore() {
        score = 0;
    }
}

class RockPaperScissorsGame {
    private Player player;
    private Player computer;
    private final String[] options = {"Rock", "Paper", "Scissors"};
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    public RockPaperScissorsGame(String playerName) {
        this.player = new Player(playerName);
        this.computer = new Player("Computer");
    }

    public void start() {
        while (true) {
            System.out.println("Enter your choice (Rock/Paper/Scissors) or 'exit' to quit:");
            String playerChoice = scanner.nextLine().toLowerCase();

            if (playerChoice.equals("exit")) {
                break;
            }

            if (!isValidChoice(playerChoice)) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            String computerChoice = options[random.nextInt(options.length)];
            System.out.println("Computer chose: " + computerChoice);
            int result = determineWinner(playerChoice, computerChoice);

            if (result == 1) {
                player.incrementScore();
                System.out.println(player.getName() + " wins!");
            } else if (result == -1) {
                computer.incrementScore();
                System.out.println("Computer wins!");
            } else {
                System.out.println("It's a tie!");
            }
            System.out.println("Score - " + player.getName() + ": " + player.getScore() + ", Computer: " + computer.getScore());
        }
        System.out.println("Final Score - " + player.getName() + ": " + player.getScore() + ", Computer: " + computer.getScore());
    }
    private boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }
    private int determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return 0; // Tie
        }
        if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return 1; // Player wins
        }
        return -1; // Computer wins
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();

        RockPaperScissorsGame game = new RockPaperScissorsGame(playerName);
        game.start();

        scanner.close();
    }
}
