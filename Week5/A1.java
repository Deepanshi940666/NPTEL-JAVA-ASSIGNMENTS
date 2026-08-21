import java.util.Scanner;

interface Number {
    int findSqr(int i); // Returns the square of n
}

// Create a class A which implements the interface Number.
class A implements Number {
    // Define a method to find the square of a number
    public int findSqr(int i) {
        return i * i;
    }
}

public class A1{
    public static void main(String[] args) {
        A a = new A(); // Create an object of class A
        // Read a number from the keyboard
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print(a.findSqr(i));
    }
}