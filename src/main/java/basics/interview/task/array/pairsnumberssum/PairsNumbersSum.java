package basics.interview.task.array.pairsnumberssum;

public class PairsNumbersSum
{
    public static void main(String[] args)
    {
        int[][] test = new int[][]{
                {1, 5, 2, 8, 3, 4, 5},
                {1, 7, 1, 6, 4, 2, 3},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test)
        {
            int[][] result = (findPairs(input, 6));
            if (result.length > 0)
            {
                System.out.println("Numbers are   : ");
                for (int i = 0; i < result.length; i++)
                {
                    System.out.print(result[i][0] + " : ");
                    System.out.println(result[i][1]);
                }
            }
            else
            {
                System.out.println("no numbers");
            }

        }
    }

    public static int[][] findPairs(int[] numbers, int number)
    {
        int[][] result = new int[numbers.length][2];
        int resultRowIndex = 0;
        int startNumber = 0;
        for (int outerNumber : numbers)
        {
            for (int index = startNumber + 1; index < numbers.length; index++)
            {
                if (outerNumber + numbers[index] == number)
                {
                    result[resultRowIndex][0] = outerNumber;
                    result[resultRowIndex][1] = numbers[index];
                    resultRowIndex++;
                }
            }
            startNumber++;
        }

        //check if at least one match exists
        int[][] output = new int[resultRowIndex][2];
        if (resultRowIndex > 0)
        {
            for (int row = 0; row < resultRowIndex; row++)
            {
                output[row][0] = result[row][0];
                output[row][1] = result[row][1];
            }
        }
        return output;
    }
}
