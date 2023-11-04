import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        AlunoVet turma = new AlunoVet(500);
        do {
            System.out.println("1 - Cadastrar Aluno\n"+
                    "2 - Procurar alunos abaixo de determinada nota\n"+
                    "3 - Calcular a média aritmética de todos os alunos\n"+
                    "0 - Sair");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    cadastrarAluno(turma);
                    break;
                case 2:
                    pesquisarAluno(turma);
                    break;
                case 3:
                    System.out.println(calcularMedia(turma));
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        }while (opcao != 0);
    }

    static void cadastrarAluno(AlunoVet t){
        Aluno aluno = new Aluno();
        int matricula;
        String nome;
        double nota1, nota2;

        System.out.println("Digite a matricula do aluno:");
        matricula = input.nextInt();
        System.out.println("Digite o nome do aluno:");
        nome = input.next();
        System.out.println("Digite a nota 1 do aluno:");
        nota1 = input.nextInt();
        System.out.println("Digite a nota 2 do aluno:");
        nota2 = input.nextInt();

        aluno = new Aluno(matricula, nome, nota1, nota2);
        if (t.inserirDados(aluno)){
            System.out.println("Operação realizada com sucesso!");
        }else {
            System.out.println("Falha na operação. Arquivo cheio");
        }
    }

    static void pesquisarAluno(AlunoVet t){
        double nota;
        int posicao;
        System.out.println("Digite a nota para usar como base:");
        nota = input.nextInt();
        posicao = t.pesquisarAlunoAbaixoNota(nota);
        if (posicao== t.getQuantVet()){
           System.out.println("Nenhum aluno abaixo dessa nota!");
        }else{
            System.out.println(t.getAluno(posicao));
        }
    }

    static String calcularMedia(AlunoVet t){
        return t.calcularMedia();
    }


}