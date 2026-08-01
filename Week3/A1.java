import java.util.Scanner;

public class A1 {
    // Create recursive method to find factorial of a number
    public static int factorial(int x) {
        if (x == 0 || x == 1) {
            // The factorial of 0 and 1 is 1
            return 1;
        } else {
            // The recursive call multiplies the current number x by the factorial of x-1
            return factorial(x - 1) * x;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        System.out.println(factorial(x));
    }
}
