import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] listaNum;

        System.out.println("Digite o tamanho do vetor:");
        listaNum = new int[input.nextInt()];

        for (int i =0; i < listaNum.length ; i++){
            System.out.printf("Digite o valor %s do vetor:\n", i+1);
            listaNum[i] = input.nextInt();
        }
        System.out.printf("A média dos itens do vetor é: %.2f\n", mediaVetor(listaNum));
    }

    public  static double mediaVetor(int[] listaNum){
        int somaVetor=0;
        for (int numero:listaNum) {
            somaVetor += numero;
        }
        return  (double) somaVetor / listaNum.length;
    }
}