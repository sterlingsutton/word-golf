import java.util.Scanner;

public class Player {
    private boolean participating = true;
    private int strokeNum = 0;
    private static int playerCount = 0;
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

    // Make a stroke. If the player wins on a stroke then return true
    public boolean stroke() {
        Scanner scanner = new Scanner(System.in);
        String sentence = "";
        // Increment the strokeNum
        strokeNum++;
        System.out.println();
        System.out.print(name + ", enter your sentence for this round : ");
        sentence = scanner.nextLine();
        // If the player wants to quit then set participating to false
        if (sentence.equals("QUIT")) {
            lameQuitterMessage();
            participating = false;
            return false;
        }
        int points = WordGolf.parseSentence(sentence);
        System.out.println("Stroke #" + strokeNum + ": \"" + sentence + "\" = ");

        if (totalPoints < 100) {
            System.out.println(points + " points");
            totalPoints += points;
        }
        else if (totalPoints > 100) {
            System.out.println("-" + points + " points");
            totalPoints -= points;
        }
        else {
            System.out.println("You won in " + strokeNum + " strokes!");
            return true;
        }
        System.out.println("Your total is " + totalPoints + " points.");
        System.out.println("You are " + Math.abs(totalPoints - 100) + " points away from your goal!");
        return false;
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
