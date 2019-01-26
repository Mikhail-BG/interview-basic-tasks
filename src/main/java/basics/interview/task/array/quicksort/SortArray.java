package basics.interview.task.array.quicksort;

import java.util.Arrays;

public class SortArray
{
    public static void main(String[] args)
    {
        int[][] test = new int[][]{
                {1, 5, 7, 2, 3, 4, 5},
                {1, 7, 1, 6, 2, 2, 3},
                {1, 0, 3, 4, 3, 0, 3},
                {1, 2, 1, 1, 1, 1, 1},};

        QuickSort quickSort = new QuickSort();

        for (int[] input : test)
        {
            System.out.println("Input array: " + Arrays.toString(input));
            System.out.println("Output array: " + Arrays.toString(quickSort.sort(input)));
            System.out.println();
        }
    }
}
