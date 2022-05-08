import java.util.Scanner;
public class CalculatorMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Division division = new Division();
        Product product = new Product();
        int option;
        double num1, num2;

        System.out.println("Qual operação deseja realizar?");
        System.out.println("Digite: 1-Soma ; 2-Subtração ; 3-Divisão ; 4-Multiplicação");

        option = sc.nextInt();

        System.out.println("Digite dois números para realizar a operação escolhida");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        switch (option) {
            case 1 -> {
                System.out.println("O resultado é: " + calculate(addition, num1, num2));
            }
            case 2 -> {
                System.out.println("O resultado é: " + calculate(subtraction, num1, num2));
            }
            case 3 -> {
                System.out.println("O resultado é: " + calculate(division, num1, num2));
            }
            case 4 -> {
                System.out.println("O resultado é: " + calculate(product, num1, num2));
            }
            default -> System.out.println("Escolha uma opção correta");
        }
    }

    public static double calculate (CalculatorOperation operation, double num1, double num2) throws Exception {
        if (operation == null) throw new Exception("Invalid operation");

        return operation.perform(num1, num2);
    }
}
