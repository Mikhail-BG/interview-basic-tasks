package basics.interview.task.array.missungnumber;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumber
{
    public static void main(String[] args)
    {
        ArrayAndCount array001 = new ArrayAndCount(new int[]{1, 2, 3, 5}, 5);
        ArrayAndCount array002 = new ArrayAndCount(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);
        ArrayAndCount array003 = new ArrayAndCount(new int[]{1, 2, 3, 4, 6}, 6);

        System.out.printf("Missing number in array %s is %d %n",
                Arrays.toString(array001.getNumbers()), findFirstMissingNumber(array001));

        printMissingNumbers(array001);
        printMissingNumbers(array002);
        printMissingNumbers(array003);
    }

    public static int findFirstMissingNumber(ArrayAndCount arrayAndCount)
    {
        int expectedSum = arrayAndCount.getCount() * ((arrayAndCount.getCount() + 1) / 2);
        int actualSum = 0;
        for (int number: arrayAndCount.getNumbers())
        {
            actualSum += number;
        }
        return expectedSum - actualSum;
    }

    public static void printMissingNumbers(ArrayAndCount arrayAndCount)
    {
        int missingCount = arrayAndCount.count - arrayAndCount.getNumbers().length;
        BitSet bitSet = new BitSet(arrayAndCount.getCount());

        for(int number: arrayAndCount.getNumbers())
        {
            bitSet.set(number - 1);
        }
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                Arrays.toString(arrayAndCount.getNumbers()), arrayAndCount.getCount());

        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++)
        {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }

    public static class ArrayAndCount
    {
        private int[] numbers;
        private int count;

        public ArrayAndCount(){}

        public ArrayAndCount(int[] numbers, int count)
        {
            this.numbers = numbers;
            this.count = count;
        }

        public int[] getNumbers()
        {
            return numbers;
        }

        public void setNumbers(int[] numbers)
        {
            this.numbers = numbers;
        }

        public int getCount()
        {
            return count;
        }

        public void setCount(int count)
        {
            this.count = count;
        }
    }
}
