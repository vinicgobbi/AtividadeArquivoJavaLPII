import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, triplo;
        double metade, raizCubica, potenciaFracional;

        System.out.println("Digite um numero:");
        numero = input.nextInt();

        triplo = numero * 3;
        metade = (double) numero / 2;
        raizCubica = Math.cbrt(numero);
        potenciaFracional = Math.pow(numero, 2.0/3);

        System.out.printf("Você digitou o numero %s \nO triplo dele é %s \nA sua metade é %.2f \nA raiz cubica é %.2f \nO Valor da potencia fracional 2/3 é %.2f", numero, triplo, metade, raizCubica, potenciaFracional);

    }
}