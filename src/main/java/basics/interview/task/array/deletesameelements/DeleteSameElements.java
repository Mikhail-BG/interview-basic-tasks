package basics.interview.task.array.deletesameelements;

import java.util.Arrays;

public class DeleteSameElements
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
            System.out.println("Numbers result: " + Arrays.toString(deleteSameElements(input)));
            System.out.println();
        }
    }

    public static int[] deleteSameElements(int[] numbers)
    {
        int arrayLength = numbers.length;
        int[] result = new int[arrayLength];
        int index = 0;
        boolean wasBefore;
        for (int indexOuter = 0; indexOuter < arrayLength; indexOuter++)
        {
            wasBefore = false;
            for (int indexFilter = 0; indexFilter < index; indexFilter++)
            {
                if (numbers[indexOuter] == result[indexFilter])
                {
                    wasBefore = true;
                    break;
                }
            }
            if (!wasBefore)
            {
                for (int indexInner = indexOuter; indexInner < arrayLength; indexInner++)
                {
                    //if last number is unique,
                    // condition (indexInner == arrayLength - 1) include this number in result
                    if (numbers[indexOuter] != numbers[indexInner]
                            || (indexInner == arrayLength - 1))
                    {
                        result[index] = numbers[indexOuter];
                        break;
                    }
                }
                index++;
            }
        }

        int[] output = new int[index];
        for (int indexOutput = 0; indexOutput < output.length; indexOutput++)
        {
            output[indexOutput] = result[indexOutput];
        }

        return output;
    }
}
