import java.util.Scanner;

class SquareThread extends Thread {
    private int begin;
    private int end;

    public SquareThread(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    public synchronized void run() {
        if (begin > end) {
            for (int i = begin; i >= end; i--) {
                System.out.println(i * i);
            }
        } else {
            for (int i = begin; i <= end; i++) {
                System.out.println(i * i);
            }
        }
    }
}

public class W09_P3 {
    public static void main(String args[]) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.close();

        SquareThread thread1 = new SquareThread(begin, end);
        SquareThread thread2 = new SquareThread(end, begin);

        thread1.start();
        thread1.join();
        thread2.start();
    }
}
