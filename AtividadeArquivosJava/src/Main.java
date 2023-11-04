import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de nomes a serem gerados:");
        int qtde =  input.nextInt();
        cadastrarPessoa(qtde);
    }

    public static void cadastrarPessoa(int qtde){
        String[] listaNomeDoMeio = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String nomeDoMeio;
        int idade;
        FileWriter out = null;
        PrintWriter writeOut = null;
        try {
            out = new FileWriter("files/output.txt", true);
            writeOut = new PrintWriter(out);
            for (int i = 0; i< qtde; i++){
                nomeDoMeio = listaNomeDoMeio[rand.nextInt(listaNomeDoMeio.length)];
                idade = rand.nextInt(80) + 1; // Só uma precaução para não ter ngm com 0 anos.
                writeOut.println(String.format("%s %s %s;%d", lerNome(), nomeDoMeio, lerSobrenome(), idade));
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            writeOut.close();
        }

    }

    public static String lerNome() {
        String linha;
        String[] linhaLista;
        FileReader arquivo = null;
        try {
            arquivo = new FileReader("files/nomes.txt");
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }

        Scanner listaNomes = new Scanner(arquivo);
        linha = listaNomes.nextLine();
        linhaLista = linha.split(";");
        return linhaLista[rand.nextInt(linhaLista.length)];
    }
    public static String lerSobrenome(){
        String linha;
        String[] linhaLista;
        FileReader arquivo;
        try {
            arquivo = new FileReader("files/sobrenomes.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner listaSobrenomes =  new Scanner(arquivo);
        linha = listaSobrenomes.nextLine();
        linhaLista = linha.split(";");
        return linhaLista[rand.nextInt(linhaLista.length)];
    }
}