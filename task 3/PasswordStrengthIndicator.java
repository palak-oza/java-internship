import java.util.Scanner;

public class PasswordStrengthIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueChecking = true;

        while (continueChecking) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            int length = password.length();
            boolean hasUpperCase = !password.equals(password.toLowerCase());
            boolean hasLowerCase = !password.equals(password.toUpperCase());
            boolean hasDigit = password.matches(".*\\d.*");
            boolean hasSpecialChar = !password.matches("[a-zA-Z0-9]*");

            if (length > 8 && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
                System.out.println("Password strength: Strong");
                System.out.println("Password strength indicator: *****");
            } else if ((length > 6 && length <= 8) && (hasUpperCase || hasLowerCase) && hasDigit || hasSpecialChar) {
                System.out.println("Password strength: Medium");
                System.out.println("Password strength indicator: ***");
            } else {
                System.out.println("Password strength: Weak");
                System.out.println("Password strength indicator: **");
            }

            System.out.print("Do you want to check another password? (yes/no): ");
            String choice = scanner.nextLine().toLowerCase();

            if (!choice.equals("yes")) {
                continueChecking = false;
            }
        }

        System.out.println("Thank you for using the Password Strength Indicator!");
        scanner.close();
    }
}
