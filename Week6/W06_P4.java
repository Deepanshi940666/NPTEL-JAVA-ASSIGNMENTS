import java.util.Scanner;

public class W06_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two integers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // try-catch-finally structure
        try {
            int result = num1 / num2;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            // Print final message, runs always
            System.out.println("Program Ended");
        }

        sc.close();
    }
}