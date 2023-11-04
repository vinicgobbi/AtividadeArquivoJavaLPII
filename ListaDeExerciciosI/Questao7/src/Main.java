import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1, x2, y1, y2;
        double distanciaX, distanciaY, distanciaPonto;

        System.out.println("Digite a cordenada x do primeiro Ponto no plano");
        x1 = input.nextInt();
        System.out.println("Digite a cordenada y do primeiro Ponto no plano");
        y1 = input.nextInt();
        System.out.println("Digite a cordenada x do segundo Ponto no plano");
        x2 = input.nextInt();
        System.out.println("Digite a cordenada y do segundo Ponto no plano");
        y2 = input.nextInt();

        distanciaPonto = Math.sqrt((Math.pow(x2 -x1, 2)+Math.pow(y2 - y1, 2)));

        System.out.printf("A distancia entre os dois pontos é: %s", distanciaPonto);

    }
}