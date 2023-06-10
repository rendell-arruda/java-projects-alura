public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 16;
        int quantidadePessoas = 3;

        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos");
//            System.out.println("Seja bem vindo");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("Voce nao tem 18 mais pode entrar por estar acompanhado");
            } else {
                System.out.println("infelizmente voce nao pode entrar");

            }
        }
    }
}
