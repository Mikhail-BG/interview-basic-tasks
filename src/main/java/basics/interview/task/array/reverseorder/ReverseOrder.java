package basics.interview.task.array.reverseorder;

import java.util.Arrays;

public class ReverseOrder
{
    public static void main(String[] args)
    {
        int[][] test = new int[][]{
                {1, 5, 7, 2, 3, 4, 5},
                {1, 7, 1, 6, 2, 2, 3},
                {1, 0, 3, 4, 3, 0, 3},
                {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test)
        {
            System.out.println("Input array: " + Arrays.toString(input));
            System.out.println("Output array: " + Arrays.toString(reverseOrder(input)));
            System.out.println();
        }
    }

    private static int[] reverseOrder(int[] input)
    {
        int length = input.length;
        int[] output = new int[length];
        int index = 0;
        for (int i = length - 1; i >= 0; i--)
        {
            output[index] = input[i];
            index++;
        }

        return output;
    }
}
