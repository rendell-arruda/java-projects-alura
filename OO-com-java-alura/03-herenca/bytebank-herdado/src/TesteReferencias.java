public class TesteReferencias {
    public static void main(String[] args) {

        //cria gerente
        Gerente g1 = new Gerente();
        g1.setNome("Marcoli");
        g1.setSalario(5000.0);

              //cria editor de video
        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        //cria designer
        Designer d = new Designer();
        ev.setSalario(2000.0);

//      cria um objeto do controle de bonificacao
        ControleBonificacao controle = new ControleBonificacao();

//      registra a bonificacao de casa funcionario
        controle.registra(g1);

        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());
    }
}
