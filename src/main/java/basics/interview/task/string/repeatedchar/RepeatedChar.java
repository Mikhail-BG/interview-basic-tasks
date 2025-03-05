package basics.interview.task.string.repeatedchar;

public class RepeatedChar
{
    public static void main(String[] args)
    {
        String ex1 = "repeated";

        System.out.println(findDuplicate(ex1));
    }

    public static String findDuplicate(String str)
    {
        char[] copy = str.toCharArray();

        for (char singleChar : copy)
        {
            str = str.substring(1);
            if (str.contains(String.valueOf(singleChar)))
            {
                return String.valueOf(singleChar);
            }
        }

        return null;
    }
}
