import java.util.Scanner;

public class W03P09 {
    public static void main(String[] args) {
        // Initialise scanner
        Scanner scanner = new Scanner(System.in);

        // Take input n
        int n = scanner.nextInt();

        // Call pyramidBuilder
        String pyramid = pyramidBuilder(n);

        // Print the pyramid
        System.out.println(pyramid);

        // Close resource stream
        scanner.close();
    }

    /**
     * Builds a pyramid of integers
     * 
     * @param n integer to go to
     * @return pyramid string
     */
    public static String pyramidBuilder(int n) {
        // Createstring to return
        StringBuilder pyramidString = new StringBuilder();

        // Loop through number of rows
        for (int r = 1; r <= n; r++) {
            // Leading spaces
            for (int i = 1; i <= n - r; i++) {
                pyramidString.append(" ");
            }
            // Integers
            for (int j = 1; j <= r; j++) {
                pyramidString.append(j + (j == r ? "" : " "));
            }
            // Create new line
            pyramidString.append("\n");
        }

        // Return the pyramid
        return pyramidString.toString();
    }
}
