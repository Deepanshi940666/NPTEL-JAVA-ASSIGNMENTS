import java.util.Scanner;

public class W06_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two integers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Use try-catch to handle possible run-time error
        try {
            int result = num1 / num2;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            // Print safe message if division by zero occurs
            System.out.println("Cannot divide by zero");
        }

        sc.close();
    }
}