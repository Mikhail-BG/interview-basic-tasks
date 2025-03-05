package basics.interview.task.number;

public class PrimeNumber {


    public static void main(String[] args) {
        printOutput(2);
        printOutput(13);
        printOutput(157);
    }

    private static void printOutput(int number) {
        System.out.println("Number: " + number + " prime: " + isPrime(number));
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false; // 0 and 1 are not prime numbers
        }
        if (number == 2) {
            return true;  // 2 is the only even prime number
        }
        if (number % 2 == 0) {
            return false; // Exclude even numbers > 2
        }

        // Check divisibility up to √number
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
