import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        ClienteVet clientes = new ClienteVet(1500);
        do {
            System.out.println("1 - Cadastrar empréstimo\n"+
                    "2 - Calcular juros de todos os clientes\n"+
                    "3 - Alterar juros do cliente com maior empréstimo\n"+
                    "0 - Sair");
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    cadastrarEmprestimo(clientes);
                    break;
                case 2:
                    calcularJuros(clientes);
                    break;
                case 3:
                    alteraJuros(clientes);
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

    static void cadastrarEmprestimo(ClienteVet t){
        String nome;
        double valorEmprestimo, valorJuros;
        System.out.println("Digite o nome do cliente:");
        input.nextLine(); //Limpa o buffer do Scanner
        nome = input.nextLine();
        if (t.pesquisaNome(nome) == t.getQuantVet()){
            System.out.println("Digite o valor do empréstimo:");
            valorEmprestimo = input.nextDouble();
            System.out.println("Digite o valor do juros:");
            valorJuros = input.nextDouble();
            Cliente emprestimo = new Cliente(nome, valorEmprestimo, valorJuros);
            if (t.inserirDados(emprestimo)){
                System.out.println("Operação realizada com sucesso!");
            }else {
                System.out.println("Falha, limite de empréstimos alcançados!");
            }
        }else {
            if (nome.equals(t.getClienteNome(t.pesquisaNome(nome)))){
                int index = t.pesquisaNome(nome);
                System.out.println(t.getCliente(index));
            }else {
                System.out.println("Digite o valor do empréstimo:");
                valorEmprestimo = input.nextDouble();
                System.out.println("Digite o valor do juros:");
                valorJuros = input.nextDouble();
                Cliente emprestimo = new Cliente(nome, valorEmprestimo, valorJuros);
                if (t.inserirDados(emprestimo)){
                    System.out.println("Operação realizada com sucesso!");
                }else {
                    System.out.println("Falha, limite de empréstimos alcançados!");
                }
            }

        }
    }
    static void calcularJuros(ClienteVet t){
        t.calcularJurosClientes();
    }

    static void alteraJuros(ClienteVet t){
        int index = t.procuraMaiorEmprestimo();
        double novoJuros;
        if (index == t.getQuantVet()){
            System.out.println("Erro, nenhum empréstimo encontrado!");
        }else {
            System.out.println("O maior empréstimo é:");
            System.out.println(t.getCliente(index));
            System.out.println("Digite o novo juros do cliente:");
            novoJuros = input.nextDouble();
            t.alteraJuros(index, novoJuros);
        }
    }
}