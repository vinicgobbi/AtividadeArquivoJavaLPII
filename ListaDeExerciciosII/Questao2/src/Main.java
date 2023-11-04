import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero");
        numero = input.nextInt();

        if (numero%2 == 0){
            System.out.println("O Numero é par");
        } else if (numero == 0) {
            System.out.println("O valor é zero");
        } else {
            System.out.println("O numero é impar");
        }
    }
}