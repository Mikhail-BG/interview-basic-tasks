package basics.interview.task.string.vowelconsonant;

import java.util.List;
import java.util.stream.Collectors;

public class CountVowelConsonant
{
    public static final String VOWELS = "aeiou";

    public static void main(String[] args)
    {
        String ex1 = "How many vowels in this String";
        int numOfVowels = countVowels(ex1);
        System.out.println("In str: '" + ex1 +
                "'\nnumber of vowels is: " + numOfVowels
                + "\nand other chars: " + (ex1.length() - numOfVowels));
    }

    public static int countVowels(String str)
    {
        int result = 0;
        List<Character> chars = str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

        for (Character ch : str.toCharArray())
        {
            if (VOWELS.contains(String.valueOf(ch)))
            {
                result++;
            }
        }

        return result;
    }
}
