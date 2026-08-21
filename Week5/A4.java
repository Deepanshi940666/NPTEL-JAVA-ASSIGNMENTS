import java.util.Scanner;
import java.util.InputMismatchException;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] name = new int[length];
        int sum = 0;

        try {
            for (int i = 0; i < length; i++) {
                name[i] = sc.nextInt();
                sum += name[i];
            }
            System.out.print(sum);
        } catch (InputMismatchException e) {
            System.out.print("You entered bad data.");
        }
    }
}