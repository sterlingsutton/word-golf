import java.util.Scanner;

public class Game {
    Player[] players;
    public Game() {
        Scanner scanner = new Scanner(System.in);
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
