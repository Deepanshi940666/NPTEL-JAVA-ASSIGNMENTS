public class W08_P4 {

    // Thread class
    static class MyThread extends Thread {

        @Override
        public void run() {
            // No output here to keep portal testing consistent
        }
    }

    public static void main(String[] args) {

        MyThread t = new MyThread();

        // Set thread priority
        t.setPriority(8);

        // Start thread
        t.start();
        // TODO: Print priority
        System.out.println("Thread priority is: " + t.getPriority());
        
        /*
        Hint:
        Use getPriority() to print the priority
        */
    }
}