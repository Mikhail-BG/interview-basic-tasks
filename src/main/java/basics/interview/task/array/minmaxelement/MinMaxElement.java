package basics.interview.task.array.minmaxelement;

public class MinMaxElement
{
    public static void main(String[] args)
    {
        int[][] test = new int[][]{
                {1, 5, 7, 8, 3, 4, 5},
                {1, 7, 1, 6, 4, 2, 3},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test)
        {
            System.out.println("Minimal element   : " + findMinimum(input));
            System.out.println("Maximum element   : " + findMaximum(input));
        }
    }

    private static int findMinimum(int[] input)
    {
        int result = input[0];
        for (int number : input)
        {
            if (result > number)
            {
                result = number;
            }
        }
        return result;
    }

    private static int findMaximum(int[] input)
    {
        int result = input[0];
        for (int number : input)
        {
            if (result < number)
            {
                result = number;
            }
        }
        return result;
    }
}
