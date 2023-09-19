package fibonacci;

/**
 * The Fibonacci class provides methods for calculating Fibonacci numbers both recursively and iteratively.
 * It includes a caching mechanism to improve the efficiency of Fibonacci number calculations.
 *
 * Fibonacci numbers are a series of numbers where each number is the sum of the two preceding ones,
 * usually starting with 0 and 1. For example: 0, 1, 1, 2, 3, 5, 8, 13, ...
 *
 * This class can handle calculating Fibonacci numbers up to a limit determined by the data type 'long.'
 * The maximum Fibonacci number that can be accurately represented by a 'long' is 92.
 *
 * @author Nick Zambri
 * @since 2/24/2023, 9/7/2023
 */
public class Fibonacci {

    private static long[] fibonacciCache;

    /**
     * Main method to demonstrate the calculation of Fibonacci numbers.
     *
     * @param args The command line arguments (not used in this example).
     */
    public static void main(String[] args) {

        int n = 50; // The nth Fibonacci number to calculate (adjust as needed)
        // The limit of a 'long' is 92, so values beyond this limit may result in overflow.

        fibonacciCache = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Note: The longest number a 'long' can hold is 9,223,372,036,854,775,807.
        // Fibonacci numbers beyond 92 will exceed this limit and may cause overflow.
    }

    /**
     * Calculates the nth Fibonacci number using a recursive approach with caching for efficiency.
     *
     * @param n The index of the Fibonacci number to calculate.
     * @return The nth Fibonacci number.
     */
    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }

    /**
     * Calculates the Fibonacci number at the specified index.
     *
     * @param index The index of the Fibonacci number to calculate (non-negative integer).
     * @return The Fibonacci number at the specified index.
     * @throws IllegalArgumentException if the index is negative.
     */
    public static int calculateFibonacci(int index) throws IllegalArgumentException {
        if (index < 0) {
            throw new IllegalArgumentException("Index must be a non-negative integer.");
        }

        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int result = 0;

            for (int i = 2; i <= index; i++) {
                result = a + b;
                a = b;
                b = result;
            }

            return result;
        }
    }
}
