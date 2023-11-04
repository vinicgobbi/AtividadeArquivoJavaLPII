import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, res;

        System.out.println("Digite um Numero:");
        num = input.nextInt();

        System.out.printf("O fatorial do numero é: %s\n",fatorial(num));
    }
    public static int fatorial(int num){
        int calcFatorial=1;
        for (int i = num;  i>0; i--){
           calcFatorial= calcFatorial * i;
        }
        return calcFatorial;
    }
}