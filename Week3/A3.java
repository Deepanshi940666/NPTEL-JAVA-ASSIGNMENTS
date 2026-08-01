import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        // Use while loop to count number of digits in an integer
        int count = 0;
        
        // The loop continues as long as num is not equal to 0
        while (num != 0) {
            // Divide the number by 10 to remove the last digit
            num = num / 10; 
            ++count;
        }
        
        System.out.print(count);
    }
}
