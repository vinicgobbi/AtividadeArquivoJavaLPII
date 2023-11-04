import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palavra;

        System.out.println("Digite a string");
        palavra = input.nextLine();

        System.out.printf("A quantidade de vogais é: %s",contVogal(palavra));
    }

    public static int contVogal(String palavra){
        int contadorVogais=0;
        char letra;
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < palavra.length(); i++){
            letra = palavra.charAt(i);
            for (char vogal:vogais) {
                if (letra == vogal){
                    contadorVogais+=1;
                }
            }
        }
        return contadorVogais;
    }
}