public class Numeral extends Expression {
    private double value;

    /**
     * Numeral constructor.
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * Get expression.
     */
    public String toString() {
        return String.format("%.0f", value);
    }

    /**
     * Evaluate.
     */
    public double evaluate() {
        return value;
    }
}
