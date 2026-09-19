import java.util.Scanner;

public class W09_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.print(p1.distance(p2));
    }
}

class Point {
    // Declare the private members x and y
    private double x;
    private double y;

    // Define the constructor to create a new point
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Define the distance() method to return the distance of this Point from another Point
    public double distance(Point p2) {
        return Math.sqrt(Math.pow(this.x - p2.x, 2) + Math.pow(this.y - p2.y, 2));
    }
}