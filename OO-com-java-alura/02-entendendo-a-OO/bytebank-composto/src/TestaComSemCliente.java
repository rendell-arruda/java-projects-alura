public class TestaComSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();

        //associa o atributo titular a um novo cliente que depois sera populado
        contaDaMarcela.titular = new Cliente();

        contaDaMarcela.titular.nome = "Marcela Ray";

        System.out.println(contaDaMarcela.titular);
        System.out.println(contaDaMarcela.titular.nome);

    }
}
