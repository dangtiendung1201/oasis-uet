public class Subtraction extends BinaryExpression {
    /**
     * Subtraction constructor.
     */
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Get expression.
     */
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }

    /**
     * Evaluate.
     */
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
