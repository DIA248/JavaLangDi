public class DivisOperation implements Operation{
    public double performTheOperation(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Exception: Нельзя делить на ноль!");
        }
        return x / y;
    }
}