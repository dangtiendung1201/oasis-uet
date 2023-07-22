// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here

    private int numerator;
    private int denominator;

    /**
     * Constructor.
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) {
            this.numerator = 1;
            this.denominator = 1;
        }
    }

    public Solution() {
        this.numerator = 1;
        this.denominator = 1;
    }

    /**
     * Getter: Numerator.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Getter: Denominator.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Setter: Numerator.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Setter: Denominator.
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            return;
        }

        this.denominator = denominator;
    }

    /**
     * Greatest common divisor.
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

    /**
     * Reduce.
     */
    public Solution reduce() {
        int gcd = gcd(numerator, denominator);
        return new Solution(numerator / gcd, denominator / gcd);
    }

    /**
     * Add.
     */
    public Solution add(Solution other) {
        int newNumerator = numerator * other.denominator + other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    /**
     * Subtract.
     */
    public Solution subtract(Solution other) {
        int newNumerator = numerator * other.denominator - other.numerator * denominator;
        int newDenominator = denominator * other.denominator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    /**
     * Multiply.
     */
    public Solution multiply(Solution other) {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    /**
     * Divide.
     */
    public Solution divide(Solution other) {
        int newNumerator = numerator * other.denominator;
        int newDenominator = denominator * other.numerator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    /**
     * Compare.
     */
    public boolean equals(Object other) {
        if (other instanceof Solution) {
            Solution otherSolution = (Solution) other;
            Solution thisSolution = this.reduce();
            otherSolution = otherSolution.reduce();
            return thisSolution.numerator == otherSolution.numerator
                    && thisSolution.denominator == otherSolution.denominator;
        }
        return false;
    }
}