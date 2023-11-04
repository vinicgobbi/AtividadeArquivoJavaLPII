import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Empresa> vendedores = new ArrayList<>();
        int opcao = 1;
        String nome, codigo, tipo;

        while (opcao != 0){
            opcao = Menu.menuPrincipal();
            switch (opcao){
                case 1:
                    System.out.println("Digite o código do vendendor:");
                    codigo = input.next();
                    System.out.println("Digite o nome do vendedor:");
                    nome = input.next();
                    System.out.println("Digite o tipo do produto [P - Perecível, N - Não perecível]:");
                    tipo = input.next().toUpperCase();
                    vendedores.add(new Empresa(nome,codigo,tipo));
                    break;
                case 2:
                    System.out.println("Digite o tipo do produto [P - Perecível, N - Não perecível]:");
                    String buscaTipo = input.next().toUpperCase();
                    int contador = 0;
                    for (Empresa vendedor: vendedores) {
                        if (vendedor.tipo.equals(buscaTipo)){
                            contador++;
                        }
                    }
                    System.out.printf("Existe(m) %d Vendedore(s) com esse tipo de produto!\n", contador);
                    break;
                case 3:
                    System.out.println("Digite o nome do vendedor a ser removido:");
                    String nomeRemove = input.next();
                    Iterator<Empresa> iterator = vendedores.iterator();
                    while (iterator.hasNext()){
                        Empresa vendendor = iterator.next();
                        if (vendendor.nome.equals(nomeRemove)){
                            iterator.remove();
                            System.out.printf("O vendedor %s foi removido", vendendor.nome);
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }
    }
}