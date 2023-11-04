import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidadeCobre, quantidadeAluminio;
        double precoCobre=2.00,precoAluminio=4.00, descontoCobre, descontoAluminio, valorFinal;

        System.out.println("Digite a quantidade de barras de cobre que será comprado:");
        quantidadeCobre = input.nextInt();
        System.out.println("Digite a quantidade de barras de aluminio que será comprado:");
        quantidadeAluminio = input.nextInt();

        if (quantidadeCobre < 5){
            descontoCobre = 0;
        } else if (quantidadeCobre <= 15) {
            descontoCobre = 0.1;
        } else if (quantidadeCobre <= 20) {
            descontoCobre = 0.15;
        }else {
            descontoCobre = 0.2;
        }

        if (quantidadeAluminio < 5){
            descontoAluminio = 0;
        } else if (quantidadeAluminio <= 15) {
            descontoAluminio = 0.1;
        } else if (quantidadeAluminio <= 20) {
            descontoAluminio = 0.15;
        }else {
            descontoAluminio = 0.2;
        }

        valorFinal = ((precoCobre * quantidadeCobre) - (precoCobre * descontoCobre)) + ((precoAluminio * quantidadeAluminio) - (precoAluminio * descontoAluminio));
        System.out.printf("O valor total pago séra: R$ %.2f", valorFinal);
    }
}