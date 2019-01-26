package basics.interview.task.array.severalsamenumbers;

import java.util.Arrays;

public class SeveralSameNumbers
{
    public static void main(String[] args)
    {
        int[][] test = new int[][]{
                {1, 5, 7, 1, 3, 1, 5},
                {1, 7, 1, 6, 2, 2, 3},
                {1, 0, 3, 4, 3, 0, 3},
                {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test)
        {
            System.out.println("Numbers in array: " + Arrays.toString(input));
            int[][] result = findSameNumbers(input);
            for (int i = 0; i < result.length; i++)
            {
                System.out.print(result[i][0] + " : ");
                System.out.println(result[i][1]);
            }
            System.out.println();
        }
    }

    public static int[][] findSameNumbers(int[] numbers)
    {
        int arrayLength = numbers.length;
        int[][] result = new int[arrayLength][2];
        int index = 0;
        int amountOfNumber;
        boolean wasCounted;

        for (int indexOuter = 0; indexOuter < arrayLength; indexOuter++)
        {
            wasCounted = false;

            //check if the number was counted in the past
            for (int filterIndex = 0; filterIndex < index; filterIndex++)
            {
                if (result[filterIndex][0] == numbers[indexOuter])
                {
                    wasCounted = true;
                    break;
                }
            }

            if (!wasCounted)
            {
                amountOfNumber = 0;

                for (int indexInner = indexOuter; indexInner < arrayLength; indexInner++)
                {
                    if (numbers[indexOuter] == numbers[indexInner])
                    {
                        amountOfNumber += 1;
                    }
                }

                //if more than one time - then save in result
                if (amountOfNumber > 1)
                {
                    result[index][0] = numbers[indexOuter];
                    result[index][1] = amountOfNumber;
                    index++;
                }
            }
        }

        int[][] output = new int[index][2];

        for (int indexOutput = 0; indexOutput < index; indexOutput++)
        {
            output[indexOutput][0] = result[indexOutput][0];
            output[indexOutput][1] = result[indexOutput][1];
        }

        return output;
    }
}
