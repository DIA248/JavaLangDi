public class LogarithmOperation implements Operation{
    @Override
    public double performTheOperation(double x, double y) {
        try {
            if (x <= 0) {
                throw new IllegalArgumentException("Exception: " + x + " - Первое число должно быть положительным!");
            }
            if (y <= 0) {
                throw new IllegalArgumentException("Exception: " + y + " - Второе число должно быть положительным!");
            }
            return Math.log(x) / Math.log(y);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
