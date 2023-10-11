public class DivisOperation implements Operation{
    public double performTheOperation(double x, double y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("Exception: Нельзя делить на ноль!");
            }
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
