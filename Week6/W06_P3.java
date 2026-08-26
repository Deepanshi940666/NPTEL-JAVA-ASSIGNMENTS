import java.util.Scanner;

public class W06_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two integers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Try block with multiple catch blocks
        try {
            int result = num1 / num2;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred");
        }

        sc.close();
    }
}
