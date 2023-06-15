public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24227);
//
//      cria um cliente
        Cliente paulo = new Cliente();

//      conta.titular = paulo;
        paulo.setNome("Paulo Silveira");

//      vincula titular ao cliente paulo
        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        System.out.println(conta.getTitular().getProfissao());

    }
}
