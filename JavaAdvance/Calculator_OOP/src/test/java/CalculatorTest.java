import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class CalculatorTest {

    @Test
    public void testAdditionOperation(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.performOperation("+", 5, 7), 12, 0.0001);
        Assert.assertEquals(calculator.performOperation("+", 5.764, 3.645), 9.409, 0.0001);
    }

    @Test
    public void testSubtractionOperation () {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.performOperation("-", 9, 3), 6, 0.0001);
        Assert.assertEquals(calculator.performOperation("-", 2.953, 5.734), -2.781, 0.0001);
    }

    @Test
    public void testMultiplicationOperation () {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.performOperation("*", 2, 6), 12, 0.0001);
        Assert.assertEquals(calculator.performOperation("*", 9.964, 3.241), 32.2933, 0.0001);
    }

    @Test
    public void testDivisionOperation () {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.performOperation("/", 8, 4), 2, 0.0001);
        Assert.assertEquals(calculator.performOperation("/", 21.964, 3.241), 6.7769, 0.0001);
    }

    @Test
    public void testLogarithmOperation () {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.performOperation("log", 10, 2), 3.3219, 0.0001);
        Assert.assertEquals(calculator.performOperation("log", 6.4327, 2.7182), 1.8615, 0.0001);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testExceptionDivisionByZero() {
        Calculator calculator = new Calculator();
        exceptionRule.expect(ArithmeticException.class);
        exceptionRule.expectMessage("Exception: Нельзя делить на ноль!");
        calculator.performOperation("/", 8, 0);
    }

    @Test
    public void testExceptionLogarithmTheFirstNumberIsPositive() {
        Calculator calculator = new Calculator();
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Exception: Первое число должно быть положительным!");
        calculator.performOperation("log", 0, 2);
    }

    @Test
    public void testExceptionLogarithmTheSecondNumberIsPositive() {
        Calculator calculator = new Calculator();
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Exception: Второе число должно быть положительным!");
        calculator.performOperation("log", 10, 0);
    }

    @Test
    public void testExceptionCorrectOperator() {
        Calculator calculator = new Calculator();
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Введен некорректный оператор: ");
        calculator.performOperation("_", 10, 0);
    }
}
