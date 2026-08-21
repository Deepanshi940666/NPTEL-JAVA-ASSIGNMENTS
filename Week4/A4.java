import java.util.Scanner;

public class A4 {
    
    // Declare parent class Employee with a protected member variable
    static class Employee {
        protected int salary; // Protected member
    }
    
    // Subclass Manager inherits from Employee
    static class Manager extends Employee {
        // No additional members required for this task
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read salary value
        int s = sc.nextInt();
        
        // Create Manager object
        Manager m = new Manager();
        
        // TO DO: Assign salary using the inherited member and print it
        
        /*
        Hint:
        Access inherited member as: m.salary = s;
        Print using: m.salary
        */
        m.salary = s;
        System.out.print(m.salary);
    }
}
