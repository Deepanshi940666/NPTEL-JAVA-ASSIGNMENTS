import java.util.Scanner;

class Student {
    private String name;
    private int age;

    // Implement the Student class with private fields (name, age),
    // a constructor, and getter/setter methods.
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class A4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Enter student name: ");
        String name = scanner.next();
        
        // System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        
        Student student = new Student(name, age);
        
        System.out.print("Name: " + student.getName() + ", Age: " + student.getAge());
        
        scanner.close();
    }
}
