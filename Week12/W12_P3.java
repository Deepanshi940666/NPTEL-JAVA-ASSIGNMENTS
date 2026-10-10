import java.util.Scanner;

public class W12_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Use nested if-else to check the number
        if (num > 0) {
            System.out.println("Positive Number");
        } else {
            if (num < 0) {
                System.out.println("Negative Number");
            } else {
                System.out.println("Zero");
            }
        }

        sc.close();
    }
}