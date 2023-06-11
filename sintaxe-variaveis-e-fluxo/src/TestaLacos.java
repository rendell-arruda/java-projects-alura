public class TestaLacos {
    public static void main(String[] args) {
        for (int multip = 1; multip <= 10; multip++) {
            for (int count = 0; count <= 10; count++) {
                System.out.print(multip * count);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
