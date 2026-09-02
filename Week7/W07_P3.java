import java.util.Scanner;

public class W07_P3 {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to compute the sum of all prime numbers in a given range [x, y]
    public static int primeSum(int x, int y) {
        int sum = 0;
        int start = Math.min(x, y);
        int end = Math.max(x, y);

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(primeSum(x, y));
    }
}