public class ProdutoVet {
    private Produto[] produtoVetor;
    private int quantVet;

    public ProdutoVet(int tamanho){
        this.produtoVetor = new Produto[tamanho];
        this.quantVet = 0;
    }

    public Produto getProduto(int index){
        return this.produtoVetor[index];
    }

    public void setProduto(int index, Produto novo){
        this.produtoVetor[index] = novo;
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
            resposta += (i+1) + " - " + this.produtoVetor[i].toString();
        }
        return resposta;
    }

    public boolean inserirDados(Produto novo){
        if (this.quantVet == this.produtoVetor.length){
            return false;
        }else {
            this.produtoVetor[this.quantVet] = novo;
            this.quantVet++;
            return true;
        }
    }

    public int pesquisaCodigo(double codigo){
        for (int i = 0; i < this.quantVet; i++){
            if (codigo == this.produtoVetor[i].getCodigo()){
                return i;
            }
        }
        return this.quantVet;
    }

    public double calcularLucro(int index){
        double precoCompra = this.produtoVetor[index].getPrecoCompra();
        double precoVenda = this.produtoVetor[index].getPrecoVenda();
        return precoVenda - precoCompra;
    }

    public void calcularEstoque(){
        String resposta = "";
        int contador = 0;
        for (int i = 0; i < this.quantVet; i++){
            if (this.produtoVetor[i].getQtdeEstoque() < this.produtoVetor[i].getEstoqueMin()){
                resposta += this.getProduto(i) + "\n";
                contador++;
            }
        }
        System.out.println(resposta);
        System.out.printf("Existe(m) %d produto(s) com estoque abaixo\n", contador);
    }
}
