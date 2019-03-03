package basics.interview.task.string.stringdigitsonly;

import java.util.regex.Pattern;

public class StringDigitsOnly
{
    public static void main(String[] args)
    {


        String ex1 = "232424";
        String ex2 = "dfdfd344";

        System.out.println(ex1 + " consist of digits only: " + isDigit(ex1));
        System.out.println(ex2 + " consist of digits only: " + isDigit(ex2));


        System.out.println(ex1 + " consist of digits only: " + isDigitPattern(ex1));
        System.out.println(ex2 + " consist of digits only: " + isDigitPattern(ex2));
    }

    private static boolean isDigit(String line)
    {
        char[] chars = line.toCharArray();
        for (char singleChar : chars)
        {
            String digits = "0123456789";
            if (!digits.contains(String.valueOf(singleChar)))
            {
                return false;
            }
        }
        return true;
    }

    private static boolean isDigitPattern(String line)
    {
        Pattern pattern = Pattern.compile(".*\\D.*");
        return !pattern.matcher(line).matches();
    }
}
