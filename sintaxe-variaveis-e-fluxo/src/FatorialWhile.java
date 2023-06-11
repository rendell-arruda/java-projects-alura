public class FatorialWhile {
    public static void main(String[] args) {
        int numero = 5;
        long fatorial = 1;
        int i = 1;

        while (i <= numero) {
            fatorial *= i;
            i++;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
