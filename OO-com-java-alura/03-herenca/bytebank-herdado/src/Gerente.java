// gerente herda do Funcionario e implementa/assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
    
    
    // reescrita do metodo
    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do GERENTE");

        //chama a implementacao padrao da bonificacao
        return super.getSalario();
    }

    @Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}

  
}