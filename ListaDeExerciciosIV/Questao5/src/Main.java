import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] listaNum, listaPar;

        System.out.println("Digite o tamanho do vetor:");
        listaNum = new int[input.nextInt()];

        for (int i = 0; i < listaNum.length; i++){
            System.out.printf("Digite o valor %s do vetor:\n", i+1);
            listaNum[i] = input.nextInt();
        }
        listaPar = verificaPar(listaNum);
        System.out.printf("Os valores pares são: %s",Arrays.toString(listaPar));
    }
    public static int[] verificaPar(int[] listaNum){
        int[] listaPar;
        int contadorPar = 0, contadorListaPar=0;
        for (int numero:listaNum) {
            if ((numero % 2) == 0){
                contadorPar++;
            }
        }
        listaPar = new int[contadorPar];
        for (int i = 0; i < listaNum.length; i++){
            if ((listaNum[i] % 2) == 0){
                if (contadorListaPar < listaPar.length){
                    listaPar[contadorListaPar] = listaNum[i];
                    contadorListaPar++;
                }
            }
        }
        return listaPar;
    }
}