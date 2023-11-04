import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;

        System.out.println("Digite o seu nome completo:");
        nome = input.nextLine();
        System.out.printf("Seu primeiro nome é: %s\n", firstName(nome));
    }

    public static String firstName(String nome){
        String[] fName;
        fName = nome.split(" ");
        return fName[0];
    }
}