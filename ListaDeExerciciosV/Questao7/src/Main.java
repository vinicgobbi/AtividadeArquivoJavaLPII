import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        FuncVet funcinonarios = new FuncVet(14);

        do {
            System.out.println("1 - Cadastrar funcionário\n" +
                    "2 - Alterar numero de horas trabalhadas de um funcionário\n" +
                    "3 - Calcular salário de todos os funcionários");
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    cadastrarFuncionario(funcinonarios);
                    break;
                case 2:
                    alterarHoras(funcinonarios);
                    break;
                case 3:
                    mostraSalarios(funcinonarios);
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }while (opcao!=0);
    }

    static void cadastrarFuncionario(FuncVet t){
        Func funcionario = new Func();
        String nome;
        double horas;
        char cargo;

        System.out.println("Digite o nome do funcionário:");
        input.nextLine(); //Limpa o buffer do Scanner
        nome = input.nextLine();
        System.out.println("Digite as horas trabalhadas do Funcionário:");
        horas = input.nextDouble();
        System.out.println("Digite o cargo do funcionários [O - Operador/ G - Gerente]");
        input.nextLine(); //Limpa o buffer do Scanner
        cargo = input.nextLine().toUpperCase().charAt(0);
        if (cargo != 'O' && cargo != 'G'){
            System.out.println("Cargo inválido, falha ao cadastrar");
        }else {
            funcionario = new Func(nome, horas, cargo);
            if (t.inserirDados(funcionario)){
                System.out.println("Funcionário cadastrado com sucesso!");
            }else {
                System.out.println("Falha ao cadastrar funcionário, limite atingido");
            }
        }
    }

    static void alterarHoras(FuncVet t){
        int index;
        double novaHora;
        System.out.println("Digite o nome do funcionário que deseja alterar a quantidade de horas trabalhadas:");
        input.nextLine(); //Limpa o buffer do Scanner
        index = t.pesquisaNome(input.nextLine());
        if (index == t.getQuantVet()){
            System.out.println("Nenhum funcionário encontrado!");
        }else {
            System.out.println("Digite a nova quantidade de horas:");
            novaHora = input.nextDouble();
            t.alterarHoras(index, novaHora);
        }
    }

    static void mostraSalarios(FuncVet t){
        System.out.println(t.calcularSalario());
    }
}