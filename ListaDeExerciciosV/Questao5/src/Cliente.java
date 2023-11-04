public class Cliente {
    private String nome;
    private double valorEmprestimo;
    private double valorJuros;

    public Cliente(String nome, double valorEmprestimo, double valorJuros){
        this.nome = nome;
        this.valorEmprestimo = valorEmprestimo;
        this.valorJuros = valorJuros;
    }

    public Cliente(){
        this.nome = "";
        this.valorEmprestimo = 0;
        this.valorJuros = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public double getValorEmprestimo(){
        return this.valorEmprestimo;
    }

    public double getValorJuros(){
        return this.valorJuros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public void setValorJuros(double valorJuros) {
        this.valorJuros = valorJuros;
    }

    public String toString(){
        return "Nome: " + this.nome+
                "\nValor Empréstimo: " + this.valorEmprestimo+
                "\nValor Juros: " + this.valorJuros;
    }
}
