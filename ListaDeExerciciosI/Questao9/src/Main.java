import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int porcentagem, codPeca1, codPeca2, qtdPeca1, qtdPeca2;
        double valorPeca1, valorPeca2, resultado;

        System.out.println("Digite a porgentagem do IPI:");
        porcentagem = input.nextInt();
        System.out.println("Digite o código da Peça 1:");
        codPeca1 = input.nextInt();
        System.out.println("Digite o Valor unitário da Peça 1:");
        valorPeca1 = input.nextDouble();
        System.out.println("Digite a quantidade de Peças 1:");
        qtdPeca1 = input.nextInt();

        System.out.println("Digite o código da Peça 2:");
        codPeca2 = input.nextInt();
        System.out.println("Digite o Valor unitário da Peça 2:");
        valorPeca2 = input.nextDouble();
        System.out.println("Digite a quantidade de Peças 2:");
        qtdPeca2 = input.nextInt();

        resultado = (valorPeca1 * qtdPeca1)+(valorPeca2 * qtdPeca2)*(porcentagem /(double)100 + 1);
        System.out.printf("O valor total a ser pago é: %.2f", resultado);
    }
}