import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option, num1, num2;

        System.out.println("Qual operação deseja realizar?");
        System.out.println("Digite: 1-Soma ; 2-Subtração ; 3-Divisão ; 4-Multiplicação");

        option = sc.nextInt();

        System.out.println("Digite dois números para realizar a operação escolhida");

        switch (option) {
            case 1 -> {
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                System.out.println("O resultado é: " + (num1 + num2));
            }
            case 2 -> {
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                System.out.println("O resultado é: " + (num1 - num2));
            }
            case 3 -> {
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                System.out.println("O resultado é: " + (num1 / num2));
            }
            case 4 -> {
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                System.out.println("O resultado é: " + (num1 * num2));
            }
            default -> System.out.println("Escolha uma opção correta");
        }
    }
}
