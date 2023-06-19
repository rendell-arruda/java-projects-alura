// gerente herda do funcionario.
public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    // reescrita do metodo
    public double getBonificacao() {
        //chama a implementacao padrao da bonificacao
        System.out.println("Chamando o metodo de bonificacao do GERENTE");
        return super.getBonificacao() + super.getSalario();
    }
}