import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class user {

    private String firstname, lastname, email, password, mobile;

    user(String firstname, String lastname, String email, String mobile, String password) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobile = mobile;
        this.password = password;

    }

    public void check() throws InvalidUserException {
        if (namevalidate(firstname)) {
            System.out.println("Valid first name.");
        } else {
            throw new InvalidUserException("Invalid first name.");
        }

        if (namevalidate(lastname)) {
            System.out.println("Valid last name.");
        } else {
            throw new InvalidUserException("Invalid last name name.");
        }

        if (emailvalidate(email)) {
            System.out.println("Valid email.");
        } else {
            throw new InvalidUserException("Invalid email.");
        }

        if (mobilevalidate(mobile)) {
            System.out.println("Valid mobile number.");
        } else {
            throw new InvalidUserException("Invalid mobile number.");
        }

        if (passwordvalidate(password)) {
            System.out.println("Valid password.");
        } else {
            throw new InvalidUserException("Invalid password.");
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