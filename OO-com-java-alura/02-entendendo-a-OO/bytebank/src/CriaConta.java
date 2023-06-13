public class CriaConta {
    public static void main(String[] args) {
        //primeira conta
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200.0;
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        //segunda conta
        Conta segundaConta = new Conta();
        segundaConta.saldo = 50.0;
        System.out.println(segundaConta.saldo);

    }
}
