import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdePessoas, sexoM=0, sexoF=0, homensAcima=0;
        String sexo;
        double altura, mediaAlturaMulheres=0;

        System.out.println("Digite a quantidade de pessoas a serem registradas:");
        qtdePessoas = input.nextInt();

        for (int i = 0; i < qtdePessoas; i++){
            System.out.println("Digite a altura da pessoa:");
            altura = input.nextDouble();
            System.out.println("Digite o Sexo da pessoa (Utilize a letra 'M' para masculino, e 'F' para feminino)");
            sexo = input.next();

            if (sexo.equals("M")){
                sexoM += 1;
                if (altura >= 1.7){
                    homensAcima +=1;
                }
            }else if (sexo.equals("F")){
                sexoF += 1;
                mediaAlturaMulheres += altura;
            }
        }
        System.out.printf("Foram registrados %s homens \nForam registradas %s mulheres \n%s homen(s) tem mais de 1,70 \nA média das alturas das mulheres é %.2f", sexoM, sexoF, homensAcima, mediaAlturaMulheres/sexoF);
    }
}