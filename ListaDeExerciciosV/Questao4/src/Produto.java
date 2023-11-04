public class Produto {
    private int codigo;
    private String descricao;
    private double precoCompra;
    private double precoVenda;
    private int qtdeEstoque;
    private int estoqueMin;

    //Construtores
    public Produto(int cod, String desc, double precoCompra, double precoVenda, int qtdeEstoque, int estoqueMin){
        this.codigo = cod;
        this.descricao = desc;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.qtdeEstoque = qtdeEstoque;
        this.estoqueMin = estoqueMin;
    }

    public Produto(){
        this.codigo = 0;
        this.descricao = "";
        this.precoCompra = 0;
        this.precoVenda = 0;
        this.qtdeEstoque = 0;
        this.estoqueMin = 0;
    }

    //getters
    public int getCodigo(){
        return this.codigo;
    }
    public String getDescricao(){
        return this.descricao;
    }

    public double getPrecoCompra(){
        return this.precoCompra;
    }
    public double getPrecoVenda(){
        return this.precoVenda;
    }
    public int getQtdeEstoque(){
        return this.qtdeEstoque;
    }
    public int getEstoqueMin() {
        return estoqueMin;
    }

    //setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public String toString(){
        return "Código: "+this.codigo+
                "\nDescrição: "+this.descricao+
                "\nPreço Compra: "+this.precoCompra+
                "\nPreço Venda: "+ this.precoVenda+
                "\nQuantidade em estoque: "+ this.qtdeEstoque+
                "\nQuantidade Minima: "+ this.estoqueMin;
    }
}
