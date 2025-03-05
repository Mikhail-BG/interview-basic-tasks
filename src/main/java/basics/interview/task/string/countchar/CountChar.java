package basics.interview.task.string.countchar;

import org.apache.commons.lang3.StringUtils;

public class CountChar
{
    public static void main(String[] args)
    {
        char symb = 'a';
        String ex1 = "asdfrewqa";

        System.out.println("Symbol '" + symb + "' in: '" + ex1 + "' appears " + countCharArray(ex1, symb) + " times.");
        System.out.println("Symbol '" + symb + "' in: '" + ex1 + "' appears " + countCharLoop(ex1, symb) + " times.");


        System.out.println("Symbol '" + symb + "' in: '" + ex1 + "' appears "
                + StringUtils.countMatches(ex1, symb) + " times.");
    }

    public static int countCharArray(String str, char symb)
    {
        int result = 0;

        for (char ch : str.toCharArray())
        {
            if (ch == symb)
            {
                result++;
            }
        }

        return result;
    }

    public static int countCharLoop(String str, char symb)
    {
        int result = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == symb)
            {
                result++;
            }
        }

        return result;
    }
}
