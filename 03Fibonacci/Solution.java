// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    static final int limit = 92;
    static final int max = 100;

    /**
     * Calculates the nth Fibonacci number.
     */
    public long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }

        long[] fib = new long[max + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= limit; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = limit + 1; i <= max; i++) {
            fib[i] = Long.MAX_VALUE;
        }
        return fib[(int) n];
    }
}