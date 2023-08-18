package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public static boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }

        // Regular expression pattern for email validation
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isValidEmail("john.doe@example.com")); // true
        System.out.println(isValidEmail("invalid-email"));        // false
        System.out.println(isValidEmail(null));                   // false
        System.out.println(isValidEmail(""));                     // false
    }
}