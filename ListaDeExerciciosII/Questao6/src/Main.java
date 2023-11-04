import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo;
        double peso, pesoKg, preco;

        System.out.println("Digite o código do produto");
        codigo = input.nextInt();


        if (codigo < 10 || codigo > 40){
            System.out.println("Código inválido");
        }else {
            System.out.println("Digite o peso do produto em toneladas:");
            peso = input.nextDouble();
            pesoKg = peso * 1000;
            if (codigo <= 20) {
                preco = pesoKg * 100;
                System.out.printf("O peso da carga do caminhão é %.2f Kg, e o valor da carga é %.2f", pesoKg, preco);
            } else if (codigo <= 30) {
                preco = pesoKg * 250;
                System.out.printf("O peso da carga do caminhão é %.2f Kg, e o valor da carga é %.2f", pesoKg, preco);
            } else {
                preco = pesoKg * 350;
                System.out.printf("O peso da carga do caminhão é %.2f Kg, e o valor da carga é %.2f", pesoKg, preco);
            }
        }


    }
}