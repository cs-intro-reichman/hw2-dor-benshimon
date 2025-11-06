// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int x = Integer.parseInt(args[0]);
		String mode = args[1];
   for (int i = 1; i <= x; i++) {
            int temp = i;
            int steps = 1;

            if (mode.equals("v")) {
                System.out.print(temp + " ");
            }

            while (temp > 1) {
                if (temp % 2 == 0) {
                    temp = temp / 2;
                } else {
                    temp = temp * 3 + 1;
                }

                if (mode.equals("v")) {
                    System.out.print(temp + " ");
                }

                steps++;
            }

            if (mode.equals("v")) {
                System.out.println("(" + steps + ")");
            }
        }

        System.out.println("Every one of the first " + x + " hailstone sequences reached 1.");
    }
}
