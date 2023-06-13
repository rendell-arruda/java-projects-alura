public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        Conta segundaConta = primeiraConta;
        segundaConta.saldo += 100;

        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);

        if (primeiraConta == segundaConta) {
            System.out.println("são a mesma conta");
        } else {
            System.out.println("são contas diferentes");
        }

        System.out.println(primeiraConta);
    }
}
