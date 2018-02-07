package ca.csci3130.cs3130_a2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by WillJStone on 07/02/18.
 */

public class Validator {
    public static int validate(String password) {
        int testsPassed = 0;
        // make sure password is not "password", case insensitive
        if (!password.equalsIgnoreCase("password")) {
            testsPassed++;
        }
        // made sure password is longer than 8 characters
        if (password.length() >= 8) {
            testsPassed++;
        }

        Pattern pattern = Pattern.compile("[a-zA-Z]*");
        Matcher matcher = pattern.matcher(password);
        // Make sure password has a number
        if (!matcher.matches()) {
            testsPassed++;
        }
        // make sure password has an uppercase letter
        if (!password.equals(password.toLowerCase())){
            testsPassed++;
        }

        Pattern pattern1 = Pattern.compile("[a-zA-Z0-9]*");
        Matcher matcher1 = pattern1.matcher(password);
        // make sure password has a special character
        if (!matcher1.matches()) {
            testsPassed++;
        }

        return testsPassed;
    }
}
