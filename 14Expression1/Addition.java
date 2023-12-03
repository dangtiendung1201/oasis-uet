public class Addition extends BinaryExpression {
    /**
     * Addition constructor.
     */
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Get expression.
     */
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    /**
     * Evaluate.
     */
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
