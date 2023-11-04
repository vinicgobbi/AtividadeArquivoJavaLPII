import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, antecessor, sucessor;

        System.out.println("Digite um numero:");
        numero = input.nextInt();
        antecessor = numero-1;
        sucessor = numero+1;
        System.out.printf("Antecessor: %s \nSucessor:%s", antecessor, sucessor);
    }
}