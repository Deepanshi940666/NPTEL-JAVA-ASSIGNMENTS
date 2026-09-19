import java.io.*;

class W09_P4 {
    public static void main(String args[]) {
        // Use appropriate try...catch block to complete the code
        try {
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            String number = br.readLine();
            int x = Integer.parseInt(number);
            System.out.println(x * x);
        } catch (Exception e) {
            System.out.println("Please enter valid data");
        }
    }
}