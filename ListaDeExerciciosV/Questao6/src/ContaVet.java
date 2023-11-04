public class ContaVet {
    private Conta[] contaVet;
    private int qtdeVet;

    public ContaVet(int tamanho){
        contaVet = new Conta[tamanho];
        qtdeVet = 0;
    }

    public Conta getCliente(int index){
        return this.contaVet[index];
    }

    public void setCliente(int index, Conta novo){
        this.contaVet[index] = novo;
    }

    public int getQtdeVet(){
        return this.qtdeVet;
    }

    public void setQtdeVet(int novo){
        this.qtdeVet = novo;
    }

    public String toString(){
        String resposta = "";
        for (int i = 0; i< this.qtdeVet; i++){
            resposta += (i+1) + " - " + this.contaVet[i].toString();
        }
        return resposta;
    }

    public boolean inserirDados(Conta novo){
        if (this.qtdeVet == this.contaVet.length){
            return false;
        }else {
            this.contaVet[this.qtdeVet] = novo;
            this.qtdeVet++;
            return true;
        }
    }

    public int pesquisaConta(int numeroConta){
        for (int i = 0; i < this.qtdeVet; i++){
            if (numeroConta == this.contaVet[i].getNumeroConta()){
                return i;
            }
        }
        return this.qtdeVet;
    }

    public String pesquisaNome(String nome){
        String resposta = "";
        for (int i = 0; i<this.qtdeVet; i++){
            if (nome.equals(this.contaVet[i].getNomeCliente())){
                resposta += this.contaVet[i].toString();
            }
        }
        return resposta;
    }

    public double getMaiorSaldo(){
        double maiorSaldo = 0;
        for (int i = 0; i < this.qtdeVet; i++){
            if (maiorSaldo < this.contaVet[i].getSaldoCliente()){
                maiorSaldo = this.contaVet[i].getSaldoCliente();
            }
        }
        return maiorSaldo;
    }

    public int getMenorSaldo(double maiorSaldo){
        double menorSaldo = maiorSaldo;
        int index = this.qtdeVet;
        for (int i = 0; i<this.qtdeVet;i++){
            if (menorSaldo > this.contaVet[i].getSaldoCliente()){
                menorSaldo = this.contaVet[i].getSaldoCliente();
                index = i;
            }
        }
        return index;
    }

    public boolean removerDados(int indexMenorSaldo){
        if (this.qtdeVet == 0){
            return false;
        }else {
            if (indexMenorSaldo==this.qtdeVet){
                return false;
            }else {
                this.contaVet[indexMenorSaldo] = this.contaVet[this.qtdeVet-1];
                this.qtdeVet--;
                return true;
            }
        }
    }
}
