import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // uc1
        System.out.println("Enter first name: ");
        String firstname = sc.nextLine();

        // define regex for validate first name
        String regex = "^[A-Z][a-z]{2,}$";

        // create pattern object
        Pattern pattern = Pattern.compile(regex);

        // create Matcher object
        Matcher matcher = pattern.matcher(firstname);

        // Check if the entered first name matches the pattern
        if (matcher.matches()) {
            System.out.println("Valid first name.");
        } else {
            System.out.println(
                    "Invalid first name. First name should start with a capital letter and have a minimum of 3 characters.");
        }

        // uc2
        System.out.println("Enter last name: ");
        String lastname = sc.nextLine();

        matcher = pattern.matcher(lastname);

        if (matcher.matches()) {
            System.out.println("Valid last name.");
        } else {
            System.out.println(
                    "Invalid last name. last name should start with a capital letter and have a minimum of 3 characters.");
        }

        // uc3
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        regex = "^[a-zA-Z0-9]+([._]+[a-zA-Z0-9]+)*@[a-zA-Z]+(\\.[a-zA-Z]{2,})+(\\.[a-zA-Z]{2,})*$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid email.");
        } else {
            System.out.println(
                    "Invalid email.");
        }

        // uc4
        System.out.println("Enter mobile number: ");
        String mobile = sc.nextLine();

        regex = "^91\\s\\d{10}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(mobile);

        if (matcher.matches()) {
            System.out.println("Valid mobile number.");
        } else {
            System.out.println(
                    "Invalid mobile number.");
        }

        // uc5,6,7,8
        // (minimum 8 characters, at least one uppercase letter, at least one numeric
        // digit, and exactly one special character)
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        regex = "^(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9]*[!@#$%^&*()_=+-][a-zA-Z0-9]*{7,}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Valid password.");
        } else {
            System.out.println(
                    "Invalid password.");
        }

        sc.close();

    }
}