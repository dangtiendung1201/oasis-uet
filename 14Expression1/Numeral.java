public class Numeral extends Expression {
    private double value;

    public Numeral(double value) {
        this.value = value;
    }

    public String toString() {
        return String.format("%.0f", value);
    }

    public double evaluate() {
        return value;
    }
}
