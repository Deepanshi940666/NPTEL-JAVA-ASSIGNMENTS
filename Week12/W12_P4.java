import java.util.Scanner;

public class W12_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        // Use a loop to add numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum is: " + sum);
        sc.close();
    }
}