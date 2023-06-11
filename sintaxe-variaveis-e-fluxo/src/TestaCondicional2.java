public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        System.out.println("---------------------");

        int idade = 18;
        int quantidadePessoas = 3;
        boolean acompanhando = quantidadePessoas >= 2 ;


        System.out.println("Número de pessoas é : " + quantidadePessoas);
        if (idade >= 18 && acompanhando) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}
