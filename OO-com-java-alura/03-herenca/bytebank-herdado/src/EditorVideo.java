public class EditorVideo extends Funcionario{
    public double getBonificacao() {

        System.out.println("Chamando o metodo de bonificacao do EDITOR DE VIDEO");

        //chama a implementacao padrao da bonificacao
        return super.getBonificacao() + 100;
    }


}
