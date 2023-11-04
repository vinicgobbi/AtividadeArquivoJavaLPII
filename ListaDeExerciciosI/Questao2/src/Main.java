import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kmInicio, kmFinal, litros, media;

        System.out.println("Digite a Kilometragem no inicio da viagem:");
        kmInicio = input.nextDouble();
        System.out.println("Digite a Kilometragem no final da viagem:");
        kmFinal = input.nextDouble();
        System.out.println("Digite a quantidade de galosina gasta durante a Viagem:");
        litros = input.nextDouble();

        media = (kmFinal - kmInicio) / litros;

        System.out.println("A média seu carro fez "+media+" Km/L");
    }
}