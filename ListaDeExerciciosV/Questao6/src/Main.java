import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        ContaVet contas = new ContaVet(15);
        do {
            System.out.println("1 - Cadastrar conta\n"+
                    "2 - Visualizar contas de um cliente\n"+
                    "3 - Excluir conta com menor saldo\n"+
                    "0 - Sair");
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    cadastrarConta(contas);
                    break;
                case 2:
                    verContasCliente(contas);
                    break;
                case 3:
                    apagarConta(contas);
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

    static void cadastrarConta(ContaVet t){
        int numeroConta;
        String nomeCliente;
        double saldoConta;

        System.out.println("Digite o numero da conta:");
        numeroConta = input.nextInt();
        if (t.pesquisaConta(numeroConta) == t.getQtdeVet()){
            System.out.println("Digite o nome do cliente:");
            input.nextLine(); //Limpa o buffer do Scanner
            nomeCliente = input.nextLine();
            System.out.println("Digite o saldo da conta:");
            saldoConta = input.nextInt();
            Conta novo = new Conta(numeroConta, nomeCliente, saldoConta);
            if (t.inserirDados(novo)){
                System.out.println("Operação realizada com sucesso!");
            }else {
                System.out.println("Falha, limite de contas atingido");
            }
        }else {
            System.out.println(t.getCliente(t.pesquisaConta(numeroConta)));
        }
    }

    static void verContasCliente(ContaVet t){
        System.out.println("Digite o nome do cliente:");
        input.nextLine(); // Limpa o buffer
        System.out.println(t.pesquisaNome(input.nextLine()));
    }

    static void apagarConta(ContaVet t){
        double maiorSaldo = t.getMaiorSaldo();
        char opcao;
        int menorSaldoIndex = t.getMenorSaldo(maiorSaldo);
        if (menorSaldoIndex == t.getQtdeVet()){
            System.out.println("Nenhuma conta cadastrada!");
        }else {
            System.out.printf("A conta com menor saldo é: %s\n", t.getCliente(menorSaldoIndex));
            System.out.println("Deseja excluir ela? [Y/N]");
            opcao = input.next().toUpperCase().charAt(0);
            if (opcao == 'Y'){
                if (t.removerDados(menorSaldoIndex)){
                    System.out.println("Sua conta foi excluida com sucesso");
                }else {
                    System.out.println("Falha durante o processo de exclusão!");
                }
            }else {
                System.out.println("Boa escolha! Manteremos sua conta em segurança");
            }
        }
    }
}