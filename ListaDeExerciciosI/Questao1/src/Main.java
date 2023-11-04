import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1, valor2, valor3;
        double mediaPonderada;

        System.out.println("Digite o primeiro valor:");
        valor1 = input.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = input.nextInt();
        System.out.println("Digite o terceiro valor:");
        valor3 = input.nextInt();

        mediaPonderada = ((2 * valor1) + (3 * valor2) + (5 * valor3))/(2 + 3 + 5);

        System.out.println("A média ponderada é: "+mediaPonderada);
    }
}