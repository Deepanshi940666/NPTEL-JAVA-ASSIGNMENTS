import java.util.Scanner;

class PrintNumbers implements Runnable {
    private int start;
    private int end;

    public PrintNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class W07_P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenStart = scanner.nextInt();
        int evenEnd = scanner.nextInt();
        int oddStart = scanner.nextInt();
        int oddEnd = scanner.nextInt();

        Thread evenThread = new Thread(new PrintNumbers(evenStart, evenEnd), "EvenThread");
        Thread oddThread = new Thread(new PrintNumbers(oddStart, oddEnd), "OddThread");

        try {
            evenThread.start();
            evenThread.join();
            oddThread.start();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}