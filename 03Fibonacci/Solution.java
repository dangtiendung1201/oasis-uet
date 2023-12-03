// Import your library
// Do not change the name of the Solution class
public class Solution {
    static final int max = 100;

    /**
     * Calculates the nth Fibonacci number.
     */
    public long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }

        int pos = 0;
        long[] fib = new long[max + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= max; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            if (fib[i] < fib[i - 1]) {
                pos = i;
                break;
            }
        }

        for (int i = pos; i <= max; i++) {
            fib[i] = Long.MAX_VALUE;
        }
        return fib[(int) n];
    }
}