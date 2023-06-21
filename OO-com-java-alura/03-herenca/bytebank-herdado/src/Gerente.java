// gerente herda do Funcionario e implementa/assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
    private int senha;
    
    
    // reescrita do metodo
    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do GERENTE");

        //chama a implementacao padrao da bonificacao
        return super.getSalario();
    }

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

  
}