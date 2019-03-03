package basics.interview.task.string.reberserecursion;

public class ReverseRecursion
{
    public static void main(String[] strs)
    {
        String ex1 = "reverse";

        System.out.println(reverseRecursively(ex1));
        System.out.println(reverse(ex1));

    }

    private static String reverse(String str)
    {
        StringBuilder stringBuilder = new StringBuilder();
        char[] stroke = str.toCharArray();

        for (int index = str.length() - 1; index >= 0; index--)
        {
            stringBuilder.append(stroke[index]);
        }

        return stringBuilder.toString();
    }

    private static String reverseRecursively(String str)
    {
        if (str.length() < 2)
        {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }
}
