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
        System.out.println("Chamando o metodo de bonificacao do GERENTE");

        //chama a implementacao padrao da bonificacao
        return super.getBonificacao() + super.getSalario();
    }
}