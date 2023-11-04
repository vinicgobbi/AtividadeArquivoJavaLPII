import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador=0, numero;
        double media = 0;
        while (true){
            System.out.println("Digite um numero: (Digite -1 para sair)");
            numero = input.nextInt();
            if (numero != -1) {
                media += numero;
                contador++;
            }else {
                break;
            }
        }
        System.out.printf("A média dos numeros é: %.2f", media/contador);
    }
}