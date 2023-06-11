public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.00;
        if (salario >= 1900 && salario <= 2800) {
            salario = salario - 142;
            System.out.println(salario);
        } else if (salario > 2800 && salario <= 3751) {
            salario = salario - 350;
            System.out.println(salario);

        } else if (salario >3751 && salario < 4464) {
            salario = salario - 636;
            System.out.println(salario);

        }
    }

}
