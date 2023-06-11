public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        System.out.println("---------------------");

        int idade = 18;
        int quantidadePessoas = 3;
        boolean acompanhado  ;

        if (quantidadePessoas >= 2 ){
            acompanhado = true;
        }else{
            acompanhado = false;
        }

        System.out.println("Número de pessoas é : " + quantidadePessoas);
        System.out.println("---------------------");

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}
