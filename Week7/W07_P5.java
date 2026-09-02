import java.util.Scanner;

public class W07_P5 {
    private String password;

    // Step 1: Constructor to initialize the password variable
    public W07_P5(String password) {
        this.password = password;
    }

    public boolean isValidPassword(String password) {
        this.password = password;

        // Step 1: Check if the password length is at least 8 characters
        if (password == null || password.length() < 8) {
            return false;
        }

        // Flag to track if there is an uppercase letter
        boolean hasUppercase = false;
        // Flag to track if there is a number
        boolean hasDigit = false;

        // Step 2: Loop through each character in the password
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true; // Found an uppercase letter
            }
            if (Character.isDigit(ch)) {
                hasDigit = true; // Found a number
            }

            // If both conditions are met, no need to check further
            if (hasUppercase && hasDigit) {
                return true;
            }
        }

        // Step 3: If either condition is not met, return false
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read password input from user
        String inputPassword = scanner.nextLine();
        scanner.close();

        W07_P5 validator = new W07_P5(inputPassword);

        // Check password validity and print result
        if (validator.isValidPassword(inputPassword)) {
            System.out.print("Valid Password");
        } else {
            System.out.print("Invalid Password");
        }
    }
}