import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, finaciamento;

        System.out.println("Digite o seu salário:");
        salario = input.nextDouble();
        System.out.println("Digite o financiamento pretendido:");
        finaciamento = input.nextDouble();

        if (finaciamento <= salario * 5) {
            System.out.println("Financiamento Concedido");
        }else {
            System.out.println("Financiamento Negado");
        }
        System.out.println("Obrigado por nos consultar.");
    }
}