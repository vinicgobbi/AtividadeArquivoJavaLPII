public class FuncVet {
    private Func[] funcVet;
    private int quantVet;

    public FuncVet(int tamanho){
        this.funcVet = new Func[tamanho];
        this.quantVet = 0;
    }

    public Func getFunc(int index){
        return this.funcVet[index];
    }

    public void setFunc(int index, Func novo){
        this.funcVet[index] = novo;
    }

    public int getQuantVet(){
        return this.quantVet;
    }

    public void setQuantVet(int novo){
        this.quantVet = novo;
    }

    public String toString(){
        String resposta = "";
        for (int i = 0; i < this.quantVet; i++) {
            resposta += (i+1) + " - " + this.funcVet[i].toString();
        }
        return resposta;
    }

    public boolean inserirDados(Func novo){
        if (this.quantVet == this.funcVet.length){
            return false;
        }else {
            this.funcVet[this.quantVet] = novo;
            this.quantVet++;
            return true;
        }
    }

    public int pesquisaNome(String nome){
        for (int i = 0; i< this.quantVet; i++){
            if (nome.equals(this.funcVet[i].getNome())){
                return i;
            }
        }
        return this.quantVet;
    }

    public void alterarHoras(int index, double novo){
        this.funcVet[index].setHoras(novo);
    }

    public String calcularSalario(){
        String resposta = "";
        double salario;
        for (int i = 0; i < this.quantVet; i++){
            if (this.funcVet[i].getCargo() == 'O'){
                salario = (112 * this.funcVet[i].getHoras());
                salario = salario + (salario * 0.1);
            }else {
                salario = (112 * this.funcVet[i].getHoras());
                salario = salario + (salario * 0.15);
            }
            resposta += String.format("%s\n" +
                    "Salário: %.2f\n", this.funcVet[i].toString(), salario);
        }
        return resposta;
    }
}
