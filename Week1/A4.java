import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        
        // Print the multiplication table of the given number, from 1 up to 4
        for (int i = 1; i <= 4; i++) {
            System.out.printf("%d x %d = %d\n", number, i, number * i);
        }
        
        in.close();
    }
}
