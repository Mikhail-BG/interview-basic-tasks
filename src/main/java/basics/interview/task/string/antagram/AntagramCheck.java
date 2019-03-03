package basics.interview.task.string.antagram;

public class AntagramCheck
{
    public static void main(String[] args)
    {
        String ex1 = "abba";
        String ex2 = "baab";

        System.out.println(ex1 + " : " + ex2 + " : " + isAnagram(ex1, ex2));
    }

    private static boolean isAnagram(String word, String anagram)
    {
        if (word.length() != anagram.length())
        {
            return false;
        }

        char[] chars = word.toCharArray();

        for (char c : chars)
        {
            int index = anagram.indexOf(c);
            if (index != -1)
            {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1);
            }
            else
            {
                return false;
            }
        }

        return anagram.isEmpty();
    }
}
