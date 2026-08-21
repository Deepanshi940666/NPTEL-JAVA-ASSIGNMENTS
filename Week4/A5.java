import java.util.Scanner;

public class A5 {
    
    // Declare Calculator class with overloaded add methods
    static class Calculator {
        // Public method to add two integers
        public int add(int a, int b) {
            return a + b;
        }
        
        // TO DO: Private method to add three integers
        private int add(int a, int b, int c) {
            return a + b + c;
        }
        
        /*
        Hint:
        Method name is add
        It takes three integer parameters
        Access modifier is private
        */
        
        // Method to demonstrate private method access within class
        public void printThreeSum(int x, int y, int z) {
            int sum = add(x, y, z); // Call private method within class
            System.out.println("Sum of three numbers: " + sum);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read two numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Read three numbers
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        Calculator calc = new Calculator();
        
        // Call public method to add two numbers
        int sumTwo = calc.add(a, b);
        System.out.println("Sum of two numbers: " + sumTwo);
        
        // Call method that prints sum of three numbers
        calc.printThreeSum(x, y, z);
    }
}
