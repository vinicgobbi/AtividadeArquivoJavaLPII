public class ClienteVet {
    private Cliente[] vetorCliente;
    private int quantVet;

    public ClienteVet(int tamanho){
        this.vetorCliente = new Cliente[tamanho];
        this.quantVet = 0;
    }

    public Cliente getCliente(int index){
        return this.vetorCliente[index];
    }
    public void setCliente(int index, Cliente novo){
        this.vetorCliente[index] = novo;
    }

    public int getQuantVet(){
        return this.quantVet;
    }

    public void setQuantVet(int novo){
        this.quantVet = novo;
    }

    public String toString(){
        String resposta = "";
        for (int i = 0; i < this.quantVet; i++){
            resposta += (i+1) + " - " + this.vetorCliente[i].toString();
        }
        return resposta;
    }

    public boolean inserirDados(Cliente novo){
        if (this.quantVet == this.vetorCliente.length){
            return false;
        }else {
            this.vetorCliente[this.quantVet] = novo;
            this.quantVet++;
            return true;
        }
    }

    public int pesquisaNome(String nome){
        for (int i = 0; i<this.quantVet;i++){
            if (nome.equals(this.vetorCliente[i].getNome())){
                return i;
            }
        }
        return this.quantVet;
    }

    public String getClienteNome(int index){
        return this.vetorCliente[index].getNome();
    }

    public void calcularJurosClientes(){
        String resposta = "";
        for (int i = 0; i < this.quantVet; i++){
            double valorJuros = this.vetorCliente[i].getValorEmprestimo() * (this.vetorCliente[i].getValorJuros()/(double) 100);
            resposta += String.format("%s: %.2f \n",this.vetorCliente[i].getNome(), valorJuros);
        }
        System.out.println(resposta);
    }

    public int procuraMaiorEmprestimo(){
        double maiorEmprestimo = 0;
        int maiorEmprestimoIndex = this.quantVet;
        for (int i = 0; i < this.quantVet; i++) {
            if (this.vetorCliente[i].getValorEmprestimo() > maiorEmprestimo) {
                maiorEmprestimo = this.vetorCliente[i].getValorEmprestimo();
                maiorEmprestimoIndex = i;
            }
        }
        if (maiorEmprestimoIndex == this.quantVet){
            return this.quantVet;
        }else {
            return maiorEmprestimoIndex;
        }
    }

    public void alteraJuros(int index, double novoJuros) {
        this.vetorCliente[index].setValorJuros(novoJuros);
    }
}
