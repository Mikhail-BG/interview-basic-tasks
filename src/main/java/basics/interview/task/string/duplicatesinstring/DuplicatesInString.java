package basics.interview.task.string.duplicatesinstring;

public class DuplicatesInString
{
    public static void main(String[] args)
    {
        String ex1 = "asdfgasdd";
        String ex2 = "asdfrewaq";

        System.out.println("Result for: " + ex1);
        findDuplicates(ex1);
        System.out.println("Result for: " + ex2);
        findDuplicates(ex2);
    }

    private static void findDuplicates(String stroke)
    {
        char[] temp = stroke.toCharArray();
        char[] vault = new char[stroke.length()];
        int index = 0;

        for (char ch : temp)
        {
            if (countChar(temp, ch) >= 2 && !isContainsChar(vault, ch))
            {
                System.out.println("Char " + ch + " : " + countChar(temp, ch) + " times");
                vault[index] = ch;
                index++;
            }
        }
    }

    private static int countChar(char[] stroke, char ch)
    {
        int counter = 0;
        for (char symb : stroke)
        {
            if (symb == ch)
            {
                counter++;
            }
        }
        return counter;
    }

    private static boolean isContainsChar(char[] stroke, char ch)
    {
        for (char symb : stroke)
        {
            if (symb == ch)
            {
                return true;
            }
        }
        return false;
    }
}
