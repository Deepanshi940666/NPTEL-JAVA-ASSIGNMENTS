import java.util.Scanner;

public class A2 {
    
    // Declare class Car with a public member variable
    static class Car {
        public int speed; // Public access, can be accessed from outside the class
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read speed value
        int s = sc.nextInt();
        
        // Create Car object
        Car c = new Car();
        
        // Assign speed to the object
        c.speed = s;
        
        // TO DO: Print the speed using the object
        /*
        Hint:
        Access the member using: c.speed
        Public members can be accessed from outside the class
        */
        System.out.print(c.speed);
    }
}