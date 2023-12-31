
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidationTest {

    user u = new user("Prarthana", "Galani", "prarthanagalani@gmail.com", "91 9313935733", "Prar@1magd");

    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    })
    public void parameterizedTestValidEmail(String validEmail) {
        Assert.assertTrue(u.emailvalidate(validEmail));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"
    })
    public void parameterizedTestInvalidEmail(String invalidEmail) {
        Assert.assertFalse(u.emailvalidate(invalidEmail));
    }

    @Test
    public void FirstnameValidateHappy() {
        Assert.assertTrue(u.namevalidate("Prarthana"));
    }

    @Test
    public void FirstnameValidateSad() {
        Assert.assertFalse(u.namevalidate("prarthana"));
    }

    @Test
    public void LastnameValidateHappy() {
        Assert.assertTrue(u.namevalidate("Galani"));
    }

    @Test
    public void LastnameValidateSad() {
        Assert.assertFalse(u.namevalidate("Galani01"));
    }

    @Test
    public void MobilevalidateHappy() {
        Assert.assertTrue(u.mobilevalidate("91 9313935733"));
    }

    @Test
    public void MobilevalidateSad() {
        Assert.assertFalse(u.mobilevalidate("9313935733"));
    }

}
