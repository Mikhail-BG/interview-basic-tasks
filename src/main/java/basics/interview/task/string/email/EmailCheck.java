package basics.interview.task.string.email;

import java.util.regex.Pattern;

public class EmailCheck {

    private static final String EMAIL_REGEX = "^(.+)@(\\S+)$";

    public static void main(String[] args) {
        printOutput("username@domain.com");
        printOutput("bfhr.bf.ee");
        printOutput("vges3@bff.vvf");
    }

    private static void printOutput(String emailToCheck) {
        System.out.println("Email " + emailToCheck + " is valid: " + isValidEmail(emailToCheck));
    }

    private static boolean isValidEmail(String input) {
        return Pattern.compile(EMAIL_REGEX)
                .matcher(input)
                .matches();
    }
}
