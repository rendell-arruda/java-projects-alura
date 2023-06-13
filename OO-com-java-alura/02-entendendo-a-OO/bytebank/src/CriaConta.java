public class CriaConta {
    public static void main(String[] args) {
        //primeira conta
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200.0;
//        primeiraConta.saldo += 100;
        primeiraConta.agencia = 146;
        System.out.println(primeiraConta.saldo);

        //segunda conta
        Conta segundaConta = new Conta();
        segundaConta.agencia = 146;

        segundaConta.saldo = 200.0;
        System.out.println(segundaConta.saldo);
        System.out.println("agencia da primeira conta n*: " + primeiraConta.agencia);

        if (primeiraConta == segundaConta) {
            System.out.println("são a mesma conta");
        } else {
            System.out.println("são contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);


    }
}
