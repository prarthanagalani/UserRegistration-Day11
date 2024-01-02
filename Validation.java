import java.util.Scanner;

public class Validation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // uc1
            System.out.println("Enter first name: ");
            String firstname = sc.nextLine();

            // uc2
            System.out.println("Enter last name: ");
            String lastname = sc.nextLine();

            // uc3
            System.out.println("Enter email: ");
            String email = sc.nextLine();

            // uc4
            System.out.println("Enter mobile number: ");
            String mobile = sc.nextLine();

            // uc5,6,7,8
            // (minimum 8 characters, at least one uppercase letter, at least one numeric
            // digit, and exactly one special character)
            System.out.println("Enter password: ");
            String password = sc.nextLine();

            user u = new user(firstname, lastname, email, mobile, password);
            u.check();
        } catch (InvalidUserException e) {
            System.out.println("Invalid user details: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
