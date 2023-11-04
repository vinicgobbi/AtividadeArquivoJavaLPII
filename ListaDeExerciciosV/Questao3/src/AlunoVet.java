public class AlunoVet {
    private Aluno[] vetorAluno;
    private int quantVet;

    //Construtores:
    public AlunoVet(int tamanho){
        this.vetorAluno = new Aluno[tamanho];
        this.quantVet = 0;
    }

    //getters e setter:
    public Aluno getAluno(int index){
        return this.vetorAluno[index];
    }

    public void setAluno(int index, Aluno novo){
        this.vetorAluno[index] = novo;
    }

    public int getQuantVet(){
        return this.quantVet;
    }

    public void setQuantVet(int novo){
        this.quantVet = novo;
    }

    public String toString(){
        String resposta = "";
        for (int i = 0; i< this.quantVet; i++){
            resposta += (i+1) + "-" + this.vetorAluno[i].toString();
        }
        return resposta;
    }

    public String calcularMedia(){
        String resposta = "";
        double media;
        for (int i = 0; i < this.quantVet; i++){
            media = (this.vetorAluno[i].getNota1() + this.vetorAluno[i].getNota2()) / 2;
            resposta += (i+1) + "- Nome:" + this.vetorAluno[i].getNome() + " Media:" + media +"\n";
        }
        return resposta;
    }

    public boolean inserirDados(Aluno novo){
        if (this.quantVet == this.vetorAluno.length){
            return false;
        }else {
            this.vetorAluno[this.quantVet] = novo;
            this.quantVet++;
            return true;
        }
    }

    public int pesquisarAlunoAbaixoNota(double notaCorte){
        for (int i = 0; i < this.quantVet; i++){
            if (notaCorte > this.vetorAluno[i].getNota1() && notaCorte > this.vetorAluno[i].getNota2()){
                return i;
            }
        }
        return this.quantVet;
    }

}
