package server.controller;

import io.javalin.http.Handler;
import server.operations.*;

import java.util.Objects;

public class CalculateController {
    public static Handler fetchCalculate = ctx -> {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Division division = new Division();
        Product product = new Product();
        Double num1  = Double.parseDouble(Objects.requireNonNull(ctx.pathParam("num1")));
        Double num2  = Double.parseDouble(Objects.requireNonNull(ctx.pathParam("num2")));
        int operationType = Integer.parseInt(Objects.requireNonNull(ctx.pathParam("operation")));
        switch (operationType) {
            case 1 -> ctx.json(Calculate.calculate(addition, num1, num2));
            case 2 -> ctx.json(Calculate.calculate(subtraction, num1, num2));
            case 3 -> ctx.json(Calculate.calculate(division, num1, num2));
            case 4 -> ctx.json(Calculate.calculate(product, num1, num2));
            default -> ctx.result("Wrong data");
        }
    };
}
