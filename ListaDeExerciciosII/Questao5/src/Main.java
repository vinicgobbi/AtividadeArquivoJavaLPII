import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldoMedio, credito;

        System.out.println("Digite o saldo médio do cliente:");
        saldoMedio = input.nextDouble();

        if (saldoMedio < 200) {
            credito = 0;
        } else if (saldoMedio <= 400) {
            credito = saldoMedio * 0.1;
        }else {
            credito = saldoMedio * 0.2;
        }

        System.out.printf("O saldo médio é de R$ %.2f, e o valor do crédito é R$ %.2f", saldoMedio, credito);
    }
}