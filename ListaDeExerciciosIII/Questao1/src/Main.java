public class Main {
    public static void main(String[] args) {
        int[] lista = new int[10];
        for (int i = 1; i <= lista.length; i++){
            lista[i-1] = i;
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}