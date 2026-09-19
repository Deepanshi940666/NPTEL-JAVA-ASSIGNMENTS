public class W08_P1 {

    // Create a class that extends Thread
    static class MyThread extends Thread {

        @Override
        public void run() {
            // TODO: Print "Thread is running" inside run method
            System.out.println("Thread is running");
        }
    }

    public static void main(String[] args) {

        // Create object of MyThread
        MyThread t = new MyThread();

        // Start the thread
        t.start();
    }
}