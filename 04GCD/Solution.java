// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here

    /**
     * Calculates the GCD of two numbers.
     */
    public int gcd(int a, int b) {
        if (a < 0) {
            a = -a;
        }
        
        if (b < 0) {
            b = -b;
        }

        if (a == 0) {
            return b;
        }

        return gcd(b % a, a);
    }
}