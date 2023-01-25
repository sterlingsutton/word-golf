import java.util.Scanner;

public class WordGolfRunner {
    public static void main(String[] args) {
        boolean playing = true;
        Scanner scanner = new Scanner(System.in);
        while (playing) {
            Game game = new Game();
            // Ask the players if they want to play again
            System.out.print("Do you want to play again? (Type YES to play again) : ");
            if (!scanner.nextLine().contains("YES")) {
                System.out.println("See you later!");
            }
        }
    }
}