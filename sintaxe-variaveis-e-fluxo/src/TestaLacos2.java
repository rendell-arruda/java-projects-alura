public class TestaLacos2 {
    public static void main(String[] args) {
        for (int line = 0; line < 10; line++) {
            for (int col = 0; col <= line; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
