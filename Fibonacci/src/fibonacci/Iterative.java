package fibonacci;

/**
 * The 'Iterative' class provides a method for calculating Fibonacci numbers using an iterative approach.
 * It efficiently computes the nth Fibonacci number without the need for recursion.
 *
 * Fibonacci numbers are a series of numbers where each number is the sum of the two preceding ones,
 * usually starting with 0 and 1. For example: 0, 1, 1, 2, 3, 5, 8, 13, ...
 *
 * This class uses an iterative algorithm to calculate the nth Fibonacci number, making it suitable for
 * large values of n without causing stack overflow issues.
 *
 * @author Nick Zambri
 * @since 2/24/2023, 9/7/2023
 */
public class Iterative {
    
    /**
     * Calculates the nth Fibonacci number using an iterative approach.
     *
     * @param n The index of the Fibonacci number to calculate.
     * @return The nth Fibonacci number.
     */
    public static int fibonacciIterative(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int c;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }
}
