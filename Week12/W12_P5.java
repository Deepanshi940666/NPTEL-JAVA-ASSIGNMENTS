import java.util.Scanner;

public class W12_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read n numbers into array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int negativeCount = 0;

        // Loop and conditions to calculate sum of positive numbers
        // and count of negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            } else if (arr[i] < 0) {
                negativeCount++;
            }
        }

        System.out.println("Sum of positive numbers: " + sum);
        System.out.println("Count of negative numbers: " + negativeCount);
        sc.close();
    }
}