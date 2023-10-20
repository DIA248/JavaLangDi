public class LogarithmOperation implements Operation{
    @Override
    public double performTheOperation(double x, double y) {
        if (x <= 0) {
            throw new IllegalArgumentException("Exception: Первое число должно быть положительным!");
        }
        if (y <= 0) {
            throw new IllegalArgumentException("Exception: Второе число должно быть положительным!");
        }
        return Math.log(x) / Math.log(y);
    }
}