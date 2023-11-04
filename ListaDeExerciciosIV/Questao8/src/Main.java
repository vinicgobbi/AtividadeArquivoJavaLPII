import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorNum;
        int comparador;

        System.out.println("Digite o tamanho do vetor:");
        vetorNum = new int[input.nextInt()];

        for (int i = 0; i < vetorNum.length; i++){
            System.out.printf("Digite o valor %s do vetor:\n", i+1);
            vetorNum[i] = input.nextInt();
        }

        System.out.println("Agora digite o numero que deve ser comparado:");
        comparador = input.nextInt();

        System.out.printf("A lista a seguir contem apenas os numeros maiores ao numero que foi comparado: %s\n", Arrays.toString(comparar(vetorNum, comparador)));
    }

    public  static int[] comparar(int[] vetorNum, int comparador){
        int contador = 0, contadorListaComparada=0;
        int[] listaComparada;
        for (int numero:vetorNum) {
            if (numero > comparador){
                contador++;
            }
        }
        listaComparada = new int[contador];
        for (int i = 0; i < vetorNum.length; i++){
            if (vetorNum[i] > comparador){
                if (contadorListaComparada < listaComparada.length){
                    listaComparada[contadorListaComparada] = vetorNum[i];
                    contadorListaComparada++;
                }
            }
        }
        return listaComparada;
    }
}