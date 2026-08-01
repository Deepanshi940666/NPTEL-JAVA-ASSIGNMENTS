import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read length and width of the rectangle
        int length = sc.nextInt();
        int width = sc.nextInt();
        // =========================================================
        // NOTE TO STUDENTS:
        // This is a simple beginner-level task.
        // Your role is to calculate the area using the given length and width.
        // Complete the line below using the correct formula.
        
        
        
        // =========================================================
        // TO DO: Calculate area of the rectangle
        /*
        Hint:
        - Multiply length and width to get the area
        - Store the result in a variable called &#39;area&#39;
        */
        int area=length*width;
        
        // Print the area
        System.out.print("Area is: " + area);
        sc.close();
    }
}
