public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 50;
        contaDoPaulo.deposita(100);

        System.out.println(contaDoPaulo.saldo);

    }
}
