package server.operations;

public class Division implements CalculatorOperation {

    @Override
    public double perform(double num1, double num2) {
        return num1 / num2;
    }
}
