package fibonacci;

/**
 * The 'Recursive' class provides a method for calculating Fibonacci numbers using a recursive approach.
 * It computes the nth Fibonacci number by recursively summing the two preceding Fibonacci numbers.
 *
 * Fibonacci numbers are a series of numbers where each number is the sum of the two preceding ones,
 * usually starting with 0 and 1. For example: 0, 1, 1, 2, 3, 5, 8, 13, ...
 *
 * This class uses a recursive algorithm to calculate the nth Fibonacci number. While it provides a clear
 * and simple implementation, it may lead to performance issues for large values of n due to repeated
 * function calls.
 *
 * @author Nick Zambri
 * @since 2/24/2023, 9/7/2023
 */
public class Recursive {
    
    /**
     * Calculates the nth Fibonacci number using a recursive approach.
     *
     * @param n The index of the Fibonacci number to calculate.
     * @return The nth Fibonacci number.
     */
    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Change n to the desired Fibonacci term
        int result = fibonacciRecursive(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
