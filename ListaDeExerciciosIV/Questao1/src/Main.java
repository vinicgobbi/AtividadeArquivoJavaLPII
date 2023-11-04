import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean par;

        System.out.println("Digite um numero:");
        num = input.nextInt();
        par = verificar(num);

        System.out.println(par);

    }
    public  static  boolean verificar(int num){
        if ((num % 2) == 0){
            return true;
        }else {
            return false;
        }
    }
}