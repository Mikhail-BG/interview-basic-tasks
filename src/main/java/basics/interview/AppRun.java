package basics.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class AppRun
{
    public static void main(String[] args)
    {
        Integer[] arrayFull = new Integer[]{1, 3, 6, 9};
        Integer[] arrayPartial = new Integer[]{1, 6, 9};

        System.out.println(findMissing(arrayFull, arrayPartial));
    }

    static int findMissing(Integer[] arrayFull, Integer[] arrayPartial)
    {
        ArrayList<Integer> full = new ArrayList<>(Arrays.asList(arrayFull));
        ArrayList<Integer> partial = new ArrayList<>(Arrays.asList(arrayPartial));

        for (Integer number : full)
        {
            if (!partial.contains(number))
            {
                return number;
            }
        }

        throw new RuntimeException();
    }
}
