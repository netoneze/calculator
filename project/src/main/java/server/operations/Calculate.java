package server.operations;

public class Calculate {

    public static double calculate(CalculatorOperation operation, double num1, double num2) throws Exception {
        if (operation == null) throw new Exception("Invalid operation");

        return operation.perform(num1, num2);
    }

}
