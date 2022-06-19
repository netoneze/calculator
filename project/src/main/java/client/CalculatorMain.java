package client;

import server.ServerMain;
import server.operations.EnvironmentalVariables;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class CalculatorMain {
    public static void main(String[] args) throws Exception {
        int option;
        double num1, num2;

        //Initialize JavalinAPI
        ServerMain server = new ServerMain();
        server.ServerRoutes();

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual operação deseja realizar?");
        System.out.println("Digite: 1-Soma ; 2-Subtração ; 3-Divisão ; 4-Multiplicação");

        option = sc.nextInt();

        if (option < 1 || option > 4) {
            System.out.println("Escolha uma opção correta");
            return;
        }

        System.out.println("Digite dois números para realizar a operação escolhida");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        String urlString = EnvironmentalVariables.API_PATH.getEnv() + String.valueOf(option) + "/" + String.valueOf(num1) + "/" +String.valueOf(num2);

        URL url = new URL(urlString);
        URLConnection conn = url.openConnection();
        InputStream is = conn.getInputStream();
        String result = readInputStreamBody(is);

        System.out.println("O resultado é: " + result);
    }

    public static String readInputStreamBody(InputStream inputStream) throws IOException {
        StringBuilder result = new StringBuilder();
        do {
            result.append((char) inputStream.read());
        } while (inputStream.available() > 0);
        return result.toString();
    }
}
