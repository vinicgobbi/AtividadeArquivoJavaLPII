public class Conta {
    private int numeroConta;
    private String nomeCliente;
    private double saldoCliente;

    public Conta(int numConta, String nomeCliente, double saldoCliente){
        this.numeroConta = numConta;
        this.nomeCliente = nomeCliente;
        this.saldoCliente = saldoCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void setNumeroConta(int numero){
        this.numeroConta = numero;
    }
    public void setNomeCliente(String nome){
        this.nomeCliente = nome;
    }
    public void setSaldoCliente(double saldo){
        this.saldoCliente = saldo;
    }

    public String toString(){
        return String.format("Nome: %s" +
                "\nNumero da conta: %d" +
                "\nSaldo da conta: $ %.2f\n", this.nomeCliente, this.numeroConta, this.saldoCliente);
    }
}
