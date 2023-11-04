public class Aluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;

    //Construtores:
    public Aluno(int matricula, String nome, double nota1, double nota2){
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno(){
        this.matricula = 0;
        this.nome = "";
        this.nota1 = 0;
        this.nota2 = 0;
    }

    //getters:
    public int getMatricula(){
        return this.matricula;
    }
    public String getNome(){
        return  this.nome;
    }
    public double getNota1(){
        return this.nota1;
    }
    public double getNota2(){
        return this.nota2;
    }

    //setters:
    public void setMatricula(int novaMatricula){
        this.matricula = novaMatricula;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setNota1(double novaNota1){
        this.nota1 = novaNota1;
    }

    public void  setNota2(double novaNota2){
        this.nota2 = novaNota2;
    }

    //Retorna todos os valores do objeto:

    public String toString(){
        return "Matricula: " + this.matricula+
                "\nNome: " + this.nome+
                "\nNota 1: "+ this.nota1+
                "\nNota 2: "+ this.nota2;
    }
}
