public abstract class BinaryExpression extends Expression {
    Expression left;
    Expression right;

    /**
     * BinaryExpression constructor.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Get expression.
     */
    public abstract String toString();

    /**
     * Evaluate.
     */
    public abstract double evaluate();
}
