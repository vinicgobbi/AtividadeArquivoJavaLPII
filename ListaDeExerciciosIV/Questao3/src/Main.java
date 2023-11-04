import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros;

        System.out.println("Digite o tamanho do vetor");
        numeros = new int[input.nextInt()];

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Digite o numero na posição %s do vetor\n", i+1);
            numeros[i] = input.nextInt();
        }
        System.out.printf("O Valor máximo do vetor é: %s\n",vetorMax(numeros));
    }

    public  static int vetorMax(int[] numeros){
        int max = 0;
        for (int numero:numeros) {
            if (numero > max){
                max = numero;
            }
        }
        return max;
    }
}