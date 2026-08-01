import java.util.Scanner;

class cls1 {
    void add(int p, int q) {
        System.out.println(p + q);
    }
}

// Create subclass cls2 of cls1 which performs task of multiplication and sum of squares of passing two parameters.
class cls2 extends cls1 {
    void mul(int p, int q) {
        System.out.println(p * q);
    }

    void task(int p, int q) {
        System.out.println((p * p) + (q * q));
    }
}
public class A2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        cls2 obj = new cls2();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // String tilde=sc.next();
        obj.add(a, b);
        obj.mul(a, b);
        obj.task(a, b);
    }
}
