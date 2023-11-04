import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em graus Celsius que você quer converter para Fahrenheit:");
        celsius = input.nextDouble();
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }
}