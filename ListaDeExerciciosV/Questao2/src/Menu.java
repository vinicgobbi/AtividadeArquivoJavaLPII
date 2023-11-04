import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    public static int menuPrincipal(){
        System.out.println("Escolha uma opção abaixo:\n"+
                "1 - Cadastrar vendedor\n"+
                "2 - Consultar quantidade de vendedores pelo tipo de mercadoria\n"+
                "3 - Excluir vendedor\n"+
                "0 - Sair");
        return Main.input.nextInt();
    }
}
