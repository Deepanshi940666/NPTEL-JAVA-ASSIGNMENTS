public class W08_P3 {

    // Create a class that extends Thread
    static class MyThread extends Thread {

        @Override
        public void run() {
            // TODO: Print "Thread is running" when thread starts work
            
            /*
            Hint:
            Use System.out.println to print the message
            */
            System.out.println("Thread is running");
        }
    }

    public static void main(String[] args) {

        // Create thread object
        MyThread t = new MyThread();

        // Thread is created but not started yet
        System.out.println("Thread state before start");

        // Start thread
        t.start();

        // Thread has started running
        System.out.println("Thread state after start");

        try {
            // Wait for thread to finish
            t.join();
        } catch (InterruptedException e) {
            // Not needed for beginners, but required to handle possible interruption
        }

        // Thread has finished
        System.out.println("Thread state after completion");
    }
}