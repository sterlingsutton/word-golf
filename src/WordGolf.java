public class WordGolf {
    // Method that takes a String in and returns its point value
    public static int parseWord(String word) {
        int points = 1;
        String vowels = "aeiouy";
        String consonants = "qwrtpsdfghjklzxcvbnm";
        for (int i = 0; i < word.length(); i++) {
            String currentChar = word.substring(i, i + 1).toLowerCase();
            // Check if the current character is a vowel or a consonant
            if (vowels.contains(currentChar)) {
                points *= 2;
            }
            else if (consonants.contains(currentChar)) {
                points += 1;
            }
        }
        return points;
    }

    // Method that splits up a sentence into words and calls the parseWord method on each respective word
    public static int parseSentence(String sentence) {
        sentence = trimSentence(sentence);
        int points = 0;
        int startIndex = 0;
        int endIndex = 0;
        for(int i = 0; i < sentence.length(); i++) {
            String currentChar = sentence.substring(i, i + 1);
            // If the currentChar is a space or the entire sentence has been iterated through then parse the last word
            if (currentChar.contains(" ") || i == sentence.length() - 1) {
                endIndex = i;
                points += parseWord(sentence.substring(startIndex, endIndex + 1));
                // Set startIndex to endIndex so that the next word starts where the last word ended
                startIndex = endIndex;
            }
        }
        return points;
    }

    // Trims extra spaces
    private static String trimSentence(String sentence) {
        String trimmedSentence = "";
        String lastChar = " ";
        for (int i = 0; i < sentence.length(); i++) {
            String currentChar = sentence.substring(i, i + 1);
            // If the currentChar isn't the same as lastChar, and they aren't spaces then add currentChar to trimmedSentence
            if (!(currentChar.equals(" ") && lastChar.equals(" "))) {
                trimmedSentence += currentChar;
            }
            lastChar = currentChar;
        }
        return trimmedSentence;
    }
}
