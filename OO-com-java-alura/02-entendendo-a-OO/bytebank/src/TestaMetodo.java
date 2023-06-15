public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 50;
        contaDoPaulo.deposita(100);

        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        //conta da marcela
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);


        boolean sucessoTranferencia = contaDaMarcela.transfere(300, contaDoPaulo);
        if (sucessoTranferencia) {
            System.out.println("Transferência feita com sucesso");
        } else {
            System.out.println("You have no money!");

        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);

        contaDoPaulo.titular = "paulo silveira";
        System.out.println(contaDoPaulo.titular);

    }
}
