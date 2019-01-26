package basics.interview.task.array.deletesameelementmem;

public class DeleteSameElement
{
    private int[] input;
    private int length;

    public int[] deleteFilter(int[] numbers)
    {
        this.input = numbers;
        this.length = numbers.length;
        int index = 0;

        int minimum;
        int temp;

        //sort by ascendant
        for (int i = 0; i < length; i++)
        {
            minimum = input[i];
            for (int j = i; j < length; j++)
            {
                if (minimum >= input[j])
                {
                    minimum = input[j];
                    index = j;
                }
            }
            temp = input[i];
            input[i] = minimum;
            input[index] = temp;
        }

        //replace with 0 duplicates
        int[] output = new int[length];
        temp = input[0];
        output[0] = input[0];
        for (int i = 0; i < length; i++)
        {
            if (input[i] != temp)
            {
                output[i] = input[i];
            }
            temp = input[i];
        }
        return output;
    }
}
