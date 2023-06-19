public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f){
        double boni = f.getBonificacao();

        //para somar todas as bonificacoes
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}
