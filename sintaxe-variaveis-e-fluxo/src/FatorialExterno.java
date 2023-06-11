import java.util.Scanner;

public class FatorialExterno {
    public static void main(String[] args) {
        int numero;
        System.out.println("Informe um número para calcular o fatorial: ");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
