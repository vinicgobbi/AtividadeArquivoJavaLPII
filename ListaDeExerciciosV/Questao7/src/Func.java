public class Func {
    private String nome;
    private double horas;
    private char cargo;

    //Construtores
    public Func(String nome, double horas, char cargo){
        this.nome = nome;
        this.horas = horas;
        this.cargo = cargo;
    }

    public Func(){
        this.nome = "";
        this.horas = 0;
        this.cargo = ' ';
    }

    //Getters
    public String getNome(){
        return this.nome;
    }

    public double getHoras(){
        return  this.horas;
    }

    public char getCargo(){
        return this.cargo;
    }

    //Setters
    public void setNome(String novo){
        this.nome = novo;
    }

    public void setHoras(double novo){
        this.horas = novo;
    }

    public void setCargo(char novo){
        this.cargo = novo;
    }

    public String toString(){
        String cargo;
        if (this.cargo == 'O'){
            cargo = "Operador";
        }else {
            cargo = "Gerente";
        }
        return String.format("Nome: %s\n" +
                "Horas trabalhadas: %.2f\n" +
                "Cargo: %s", this.nome, this.horas, cargo);
    }

}
