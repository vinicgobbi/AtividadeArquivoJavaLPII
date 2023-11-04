import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Digite o numero");
        num = input.nextInt();
        System.out.println(verificaPrimo(num));

    }

    public static boolean verificaPrimo(int num){
        for (int i = 2; i < num; i++){
            if ((num % i) == 0){
                return false;
            }
        }
        return true;
    }
}