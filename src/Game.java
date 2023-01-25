import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    ArrayList<Player> players = new ArrayList<>();
    public Game() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to Word Golf!");
        System.out.println("Rules :");
        System.out.println(" 1.) Each player enters a sentence per turn.");
        System.out.println(" 2.) From left to right, if there's a consonant then add 1,");
        System.out.println("     if there's a vowel then multiply by 2.");
        System.out.println(" 3.) Add the points to the total for the player.");
        System.out.println(" 4.) If the player reaches exactly 100 points then they win.");
        System.out.println("     If they overshoot then the points will subtract instead of add.");
        System.out.println(" NOTE: If at any time during the game you would like to quit");
        System.out.println("     then simply enter QUIT in all caps and you will be removed from the game.");
        // Ask how many players will be playing
        System.out.println();
        System.out.print("How many players? (1-10) : ");
        int numPlayers = 0;
        while (numPlayers <= 0 || numPlayers > 10) {
            String input = scanner.nextLine();
            // If the input can't be parsed then catch the exception and have the user try again
            try {
                numPlayers = Integer.parseInt(input);
                if (numPlayers <= 0 || numPlayers > 10) {
                    System.out.println("Enter a number between 1 and 10 please!");
                }
            }
            catch (Exception e) {
                System.out.println("Enter a number please!");
            }
        }
        // Create all the players
        for (int i = 0; i < numPlayers; i++) {
            players.add(new Player());
        }

        // Game loop
        boolean isDone = false;
        while (!isDone) {
            for (Player player : players) {
                // If the player is participating then make a stroke
                if (player.isParticipating()) {
                    isDone = player.stroke();
                }
            }
        }
    }
}
