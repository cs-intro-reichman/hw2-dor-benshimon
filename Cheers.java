//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String word = args[0];
        int x = Integer.parseInt(args[1]);
        char[] anletters = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'};
        word = word.toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            String psic = "a";

            for (char C : anletters) {
                if (letter == C) {
                    psic = "an";
                    break;
                }
            }

            if (psic.equals("an")) {
                System.out.println("Give me " + psic + " " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me " + psic + "  " + letter + ": " + letter + "!");
            }
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < x; i++) {
            System.out.println(word + "!!!");
        }
    }
}

