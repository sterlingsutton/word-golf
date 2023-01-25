import java.util.Scanner;

public class Player {
    private boolean participating = true;
    private int strokeNum = 0;
    private static int playerCount = 0;
    private int numSentences;
    private int totalPoints;
    private String name;

    public boolean isParticipating() {
        return participating;
    }

    public Player() {
        Scanner scanner = new Scanner(System.in);
        // Increment the playerCount
        playerCount++;
        // Ask for the user's name
        System.out.print("Enter a name for player #" + playerCount + " : ");
        name = scanner.nextLine();
    }

    public void stroke() {
        Scanner scanner = new Scanner(System.in);
        String sentence = "";
        // Increment the strokeNum
        strokeNum++;
        System.out.print("Enter your sentence for this round : ");
        sentence = scanner.nextLine();
        if (sentence.equals("QUIT")) {

        }
    }

    // Terrorize the user if they desire to quit ;)
    private void lameQuitterMessage() {
        participating = false;
        String[] messageVariants = {
                "I'm disappointed in you!",
                "Leaving so soon?",
                "What a party pooper!",
                "How lame of you!",
                "Gosh that killed the mood!",
                "We were having fun until you ruined it!",
                "Word golf isn't your jam?"
        };

        // Print a random message from the messageVariants list
        System.out.println(messageVariants[(int)(Math.random() * messageVariants.length)]);
    }
}
