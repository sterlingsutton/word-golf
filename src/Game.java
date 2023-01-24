import java.util.Scanner;

public class Game {
    Player[] players;
    public Game() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Word Golf!");
        // Ask how many players will be playing
        System.out.print("How many players? (1-10) : ");
        int numPlayers = 0;
        while (numPlayers <= 0 || numPlayers > 10) {
            String input = scanner.nextLine();
            // If the input can't be parsed then catch the exception and have the user try again
            try {
                numPlayers = Integer.parseInt(input);
            }
            catch (Exception e) {
                System.out.println("Enter a whole number between 1 and 10 please!");
            }
        }
        players = new Player[numPlayers];

        for (Player player : players) {
            player = new Player();
        }
    }
}
