public class LogarithmOperation implements Operation{
    @Override
    public double performTheOperation(double x, double y) {
        return Math.log(x) / Math.log(y);
    }
}