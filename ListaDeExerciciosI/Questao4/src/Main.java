import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choppes, cobertura;
        double valor, gorjeta, valorChoppe=1.80, valorPizza=25.00, valorCobertura=3.50;

        System.out.println("Digite a quantidade de Choppes que a turma pediu:");
        choppes = input.nextInt();
        System.out.println("Digite a quantidade de coberturas que a turma pediu:");
        cobertura = input.nextInt();

        valor = (choppes * valorChoppe) + ( 1 * valorPizza) + (cobertura * valorCobertura);
        gorjeta = valor * 0.1;

        System.out.println("O valor da conta será de: "+valor+
                "\nO valor da Gorjeta será de: "+gorjeta);
    }
}