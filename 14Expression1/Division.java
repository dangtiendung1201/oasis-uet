public class Division extends BinaryExpression {
    /**
     * Division constructor.
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Get expression.
     */
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    /**
     * Divide.
     */
    public static double divide(double a, double b) throws ArithmeticException {
        return a / b;
    }

    /**
     * Evaluate.
     */
    public double evaluate() throws ArithmeticException {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        
        return left.evaluate() / right.evaluate();
    }
}
