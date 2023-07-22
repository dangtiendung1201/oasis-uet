// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here

    /**
     * Check if a number is prime.
     */
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}