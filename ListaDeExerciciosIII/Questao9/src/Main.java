public class Main {
    public static void main(String[] args) {
        double serie=0;
        System.out.println("Esse código se baseia em resultados aproximados!!!");
        for (int i = 1; i <= 50; i++){
            serie += (1/(double)i);
            System.out.printf("1/%d = %.2f\n",i, 1/(double)i);
        }
        System.out.printf("O resultado aproximado da série é: %.2f", serie);
    }
}