public class Empresa {
    String nome;
    String codigo;
    String tipo;

    public Empresa(String nome, String codigo, String tipo){
        this.nome = nome;
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public Empresa(){
        this.nome = "";
        this.codigo = "";
        this.tipo = "";
    }
}
