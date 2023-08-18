package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            return false;
        }

        // Regular expression pattern for phone number validation
        // Phone numbers should start with digits 6 to 9 and have a total of 10 digits.
        String phonePattern = "^[6-9]\\d{9}$";
        Pattern pattern = Pattern.compile(phonePattern);
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isValidPhoneNumber("9876543210"));   // true
        System.out.println(isValidPhoneNumber("1234567890"));   // false (doesn't start with 6 to 9)
        System.out.println(isValidPhoneNumber("invalid-phone"));// false
        System.out.println(isValidPhoneNumber(null));           // false
        System.out.println(isValidPhoneNumber(""));             // false
    }
}
