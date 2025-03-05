package basics.interview.task.string.reversewords;

public class ReverseWords
{
    public static void main(String[] args)
    {
        String ex1 = "door is open for now";

        System.out.println(process(ex1));
    }

    private static String process(String str)
    {
        String[] words = str.split(" ");
        StringBuilder strB = new StringBuilder();
        for (String word : words)
        {
            strB.append(reverse(word)).append(" ");
        }
        String result = strB.toString();
        result = result.substring(0, result.length() -1);
        return result;
    }

    private static String reverse(String str)
    {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
        {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
