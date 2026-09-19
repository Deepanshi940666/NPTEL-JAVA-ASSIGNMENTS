public class W08_P2 {

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            // TODO: Print "Runnable thread is running" inside run method
            System.out.println("Runnable thread is running");
        }
    }

    public static void main(String[] args) {

        // Create object of MyRunnable
        MyRunnable r = new MyRunnable();

        // Create Thread using Runnable object
        Thread t = new Thread(r);

        // Start the thread
        t.start();
    }
}