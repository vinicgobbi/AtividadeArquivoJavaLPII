import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        ProdutoVet produtos = new ProdutoVet(40);
        do {
            System.out.println("1 - Cadastrar Produtos\n"+
                    "2 - Calcular lucro com a venda de um produto\n"+
                    "3 - Procurar produtos com estoque abaixo do minimo\n"+
                    "0 - Sair");
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    cadastrarProduto(produtos);
                    break;
                case 2:
                    calcularLucro(produtos);
                    break;
                case 3:
                    calcularEstoque(produtos);
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }while (opcao != 0);
    }

    static void cadastrarProduto(ProdutoVet t){
        Produto produto;
        int codigo, qtdeEstoque, estoqueMin;
        String descricao;
        double precoCompra, precoVenda;

        System.out.println("Digite o código do produto:");
        codigo = input.nextInt();
        System.out.println("Digite a descrição do produto:");
        input.nextLine(); //Limpa o buffer do Scanner
        descricao = input.nextLine();
        System.out.println("Digite o preço de compra do produto:");
        precoCompra = input.nextDouble();
        System.out.println("Digite o preço de venda do produto:");
        precoVenda = input.nextDouble();
        System.out.println("Digite a nova quantidade do produto:");
        qtdeEstoque = input.nextInt();
        System.out.println("Digite o estoque minimo do produto:");
        estoqueMin = input.nextInt();

        produto = new Produto(codigo, descricao, precoCompra, precoVenda, qtdeEstoque, estoqueMin);
        if (t.inserirDados(produto)){
            System.out.println("Operação realizada com sucesso!");
        }else {
            System.out.println("Operação falhou, quantidade máxima de produtos alcançada!");
        }
    }

    static void calcularLucro(ProdutoVet t){
        int posicao;
        System.out.println("Digite o código do produto:");
        posicao = t.pesquisaCodigo(input.nextInt());
        if (posicao == t.getQuantVet()){
            System.out.println("Nenhum produto encontrado!");
        }else {
            System.out.println("O lucro é de: $" + t.calcularLucro(posicao));
        }
    }

    static void calcularEstoque(ProdutoVet t){
        t.calcularEstoque();
    }
}