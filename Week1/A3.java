import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();
        
        // Calculate the volume of the cylinder
        // V = PI * r^2 * h
        double volume = Math.PI * radius * radius * height;
        
        // Display the result
        System.out.printf("Volume is: %.2f", volume);
        in.close();
    }
}
