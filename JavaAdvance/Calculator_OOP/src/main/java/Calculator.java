import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private final Map<String, Operation> operationMap;


    public Calculator() {
        operationMap = new HashMap<>();
        operationMap.put("+", new AdditOperation());
        operationMap.put("-", new SubtractOperation());
        operationMap.put("*", new MultipOperation());
        operationMap.put("/", new DivisOperation());
        operationMap.put("log", new LogarithmOperation());
    }

    public double performOperation(String operation, double a, double b) {
        Operation selectedOperation = operationMap.get(operation);
        if (selectedOperation != null) {
            return selectedOperation.performTheOperation(a, b);
        } else {
            throw new IllegalArgumentException("Введен некорректный оператор: " + operation);
        }
    }
}