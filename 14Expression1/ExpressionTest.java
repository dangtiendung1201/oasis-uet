public class ExpressionTest {
    public static void main(String[] args) {
        // ((((10) ^ 2 + -3) + (5 * -3))) ^ 2
        Expression e = new Square(
            new Addition(
                new Addition(
                    new Square(
                        new Numeral(10)
                    ),
                    new Numeral(-3)
                ),
                new Multiplication(
                    new Numeral(5),
                    new Numeral(-3)
                )
            )
        );
        System.out.println(e + " = " + e.evaluate());
        BinaryExpression e1 = new Subtraction(new Numeral(2), new Numeral(1));
        System.out.println(e1 + " = " + e1.evaluate());

    }
}
