public class Multiplication extends BinaryExpression {
    /**
     * Multiplication constructor.
     */
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Get expression.
     */
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }

    /**
     * Evaluate.
     */
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
