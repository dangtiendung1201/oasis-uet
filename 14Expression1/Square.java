public class Square extends Expression {
    private Expression expression;

    /**
     * Square constructor.
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * Get expression.
     */
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }

    /**
     * Evaluate.
     */
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}
