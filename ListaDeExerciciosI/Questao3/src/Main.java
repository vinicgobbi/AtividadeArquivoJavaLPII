import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String piloto;
        double distancia;
        int tempo;

        System.out.println("Digite o nome do piloto:");
        piloto = input.nextLine();
        System.out.println("Digite a distancia percorrida em Kilometros:");
        distancia = input.nextDouble();
        System.out.println("Digite o tempo gasto para percorrer a distancia em horas:");
        tempo = input.nextInt();

        System.out.println("A velocidade média de "+ piloto +" foi "+ (distancia/tempo) +" km/h");
    }
}