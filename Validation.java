import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class user {

    private String firstname, lastname, email, password, mobile;

    user(String firstname, String lastname, String email, String mobile, String password) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobile = mobile;
        this.password = password;

    }

    public void check() {
        if (namevalidate(firstname)) {
            System.out.println("Valid first name.");
        } else {
            System.out.println("Invalid first name.");
        }

        if (namevalidate(lastname)) {
            System.out.println("Valid last name.");
        } else {
            System.out.println("Invalid last name.");
        }

        if (emailvalidate(email)) {
            System.out.println("Valid email.");
        } else {
            System.out.println("Invalid email.");
        }

        if (mobilevalidate(mobile)) {
            System.out.println("Valid mobile number.");
        } else {
            System.out.println("Invalid mobile number.");
        }

        if (passwordvalidate(password)) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password.");
        }

    }

    public boolean namevalidate(String name) {
        // define regex for validate first name
        String regex = "^[A-Z][a-z]{2,}$";

        // create pattern object
        Pattern pattern = Pattern.compile(regex);

        // create Matcher object
        Matcher matcher = pattern.matcher(name);

        if (matcher.matches())
            return true;
        else
            return false;

    }

    public boolean emailvalidate(String email) {
        String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean mobilevalidate(String mobile) {
        String regex = "^91\\s\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobile);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean passwordvalidate(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()-_+=]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

}

public class Validation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        sc.close();

    }

}
