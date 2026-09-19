import java.util.Scanner;

public class W09_P2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // Read as string, e.g., 5+6

        // Declare and initialize the required variable(s)
        char[] seq = input.toCharArray();
        int operatorIndex = -1;
        char operator = ' ';

        // Split the input string into character array
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] == '+' || seq[i] == '-' || seq[i] == '*' || seq[i] == '/') {
                operator = seq[i];
                operatorIndex = i;
                break;
            }
        }

        /*
         write your method to separate two operands
         and operators and then perform the required operation.
        */
        double num1 = Double.parseDouble(input.substring(0, operatorIndex).trim());
        double num2 = Double.parseDouble(input.substring(operatorIndex + 1).trim());
        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }

        // Print the output as stated in the question
        System.out.print(input + " = " + Math.round(result));
    } // The main() method ends here
} // The main class ends here
