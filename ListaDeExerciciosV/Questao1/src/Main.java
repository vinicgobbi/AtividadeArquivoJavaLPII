import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
class Filme {
     String codigo;
     String nome;
     String genero;

    public Filme(String codigo, String nome, String genero){
        this.codigo = codigo;
        this.nome = nome;
        this.genero = genero;
    }
    public Filme(){
        this.codigo = "";
        this.nome = "";
        this.genero = "";
    }
}
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Filme> filmes = new ArrayList<>();
        int opcao = 1;
        String nomeFilme, genFilme, codFilme;

        while (opcao != 0){
            opcao = menu();
            switch (opcao){
                case 1:
                    System.out.println("Digite o Código do Filme:");
                    codFilme = input.next();
                    System.out.println("Digite o nome do Filme:");
                    nomeFilme = input.next();
                    System.out.println("Digite o Genero do Filme (A - ação, T - terror, D - drama):");
                    genFilme = input.next();
                    genFilme = genFilme.toUpperCase();
                    filmes.add(new Filme(codFilme, nomeFilme, genFilme));
                    System.out.printf("O Filme %s foi adicionado\n", nomeFilme);
                    break;
                case 2:
                    System.out.println("Digite o Genero do filme (A - ação, T - terror, D - drama):");
                    String buscaGen = input.next().toUpperCase();
                    int contador = 0;
                    for (Filme filme : filmes) {
                        if (filme.genero.equals(buscaGen)){
                            contador++;
                        }
                    }
                    System.out.printf("Existe(m) %s Filme(s) com esse genêro\n", contador);
                    break;
                case 3:
                    Iterator<Filme> iterator = filmes.iterator();
                    System.out.println("Digite o nome do filme que deseja remover:");
                    String nomeRemove = input.next();
                    while (iterator.hasNext()){
                        Filme filme = iterator.next();
                        if (filme.nome.equals(nomeRemove)){
                            iterator.remove();
                            System.out.printf("O Filme %s foi removido\n", filme.nome);
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida, tente outra!");

            }
        }
    }


    public static int menu(){
        int opcao;
        System.out.println("Bem vindo ao registrador de filmes!");
        System.out.println("Escolha uma opção abaixo:\n"+
                "1 - Adicionar novo Filme\n"+
                "2 - Consultar quantidade de filmes pelo genêro\n"+
                "3 - Remover filme\n"+
                "0 - Sair");
        return opcao = input.nextInt();
    }

}