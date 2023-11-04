import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codProduto, opcao;
        double valorProduto, novoValorProduto=0;

        while (true){
            System.out.println("Calculadora de Aumentos de valores!\n"+
                    "1)Realizar Calculo de novo valor do produto\n"+
                    "0)Sair");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do produto:");
                    valorProduto = input.nextDouble();
                    System.out.println("Digite o código do produto:");
                    codProduto = input.nextInt();
                    if (codProduto == 1){
                        novoValorProduto = valorProduto + (valorProduto*0.1);
                    }else if (codProduto == 3){
                        novoValorProduto = valorProduto + (valorProduto*0.25);
                    }else if (codProduto == 4){
                        novoValorProduto = valorProduto + (valorProduto*0.3);
                    }else if (codProduto == 8){
                        novoValorProduto = valorProduto + (valorProduto*0.5);
                    }
                    System.out.printf("O novo valor do produto %.2f\n", novoValorProduto);
                    break;
                case 0:
                    System.exit(0);
            }

        }
    }

}