package basics.interview.task.array.quicksort;

public class QuickSort
{
    private int[] input;

    public int[] sort(int[] numbers)
    {
        if (numbers == null || numbers.length == 0)
        {
            return numbers;
        }
        this.input = numbers;
        int length = numbers.length;
        return quickSort(0, length - 1);
    }

    private int[] quickSort(int low, int high)
    {
        int i = low;
        int j = high;
        int pivot = input[low + (high - low) / 2];

        while (i <= j)
        {
            while (input[i] < pivot)
            {
                i++;
            }
            while (input[j] > pivot)
            {
                j--;
            }
            if (i <= j)
            {
                swap(i, j);
                i++;
                j--;
            }
        }

        if (low < j)
        {
            quickSort(low, j);
        }

        if (i < high)
        {
            quickSort(i, high);
        }

        return input;
    }

    private void swap(int i, int j)
    {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
