import java.util.Scanner;

public class W12_P1 {
    // Declare Student class
    static class Student {
        String name;
        int roll;

        // Parameterized constructor to set name and roll
        Student(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int roll = sc.nextInt();

        // Create object of Student class with given values
        Student s = new Student(name, roll);

        // Print student details
        System.out.println("Student Name: " + s.name);
        System.out.println("Roll Number: " + s.roll);

        sc.close();
    }
}