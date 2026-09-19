import java.util.Scanner;

public class W09_P1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Declare the 5x5 2D array to store the input
        int[][] matrix = new int[5][5];

        // Input 2D Array using Scanner Class and check data validity
        int count = 0;
        while (count < 25 && sc.hasNext()) {
            String token = sc.next();
            for (int k = 0; k < token.length(); k++) {
                char ch = token.charAt(k);
                if (ch == '0' || ch == '1') {
                    if (count < 25) {
                        matrix[count / 5][count % 5] = ch - '0';
                        count++;
                    }
                } else {
                    System.out.print("Invalid Input");
                    return;
                }
            }
        }

        if (count < 25) {
            System.out.print("Invalid Input");
            return;
        }

        // Perform the Flip-Flop Operation
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (matrix[i][j] == 0) ? 1 : 0;
            }
        }

        // Output the 2D Flip-Flop Array
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j]);
            }
            if (i < 4) {
                System.out.println();
            }
        }
    } // The main() ends here
} // The main class ends here