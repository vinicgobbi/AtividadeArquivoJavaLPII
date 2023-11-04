import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numerador, denominador, resultado=0;

        System.out.println("Digite o numerador da Divisão (--> X/Y):");
        numerador = input.nextDouble();
        System.out.println("Digite o Denominador da Divisão(X/Y <--):");
        denominador = input.nextDouble();

        if (denominador == 0){
            System.out.println("Divisão indeterminada");
        }else {
            resultado = numerador/denominador;
            System.out.printf("O Resultado da divisão é: %f", resultado);
        }
    }
}