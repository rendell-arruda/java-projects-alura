public class EditorVideo extends Funcionario{
    public double getBonificacao() {

        //chama a implementacao padrao da bonificacao
        System.out.println("Chamando o metodo de bonificacao do EDITOR DE VIDEO");
        return super.getBonificacao() + 100;
    }


}
