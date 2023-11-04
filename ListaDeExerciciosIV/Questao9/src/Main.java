import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o valor do numero 1:");
        num1 = input.nextInt();
        System.out.println("Digite o valor do numero 2:");
        num2 = input.nextInt();

        System.out.printf("O MDC é: %s\n", calcMaxDivComum(num1, num2));
    }

    public static int calcMaxDivComum(int num1, int num2){
        int  mdc;
        while (num2 != 0){
            int tmpNum2 = num2;
            num2 = num1 % num2;
            num1 = tmpNum2;
        }
        mdc = num1;
        return mdc;
    }
}