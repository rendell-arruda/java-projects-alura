public class TesteFuncionario2 {
    public static void main(String[] args) {
        FuncionarioTeste func1 = new FuncionarioTeste();

        System.out.println(func1.getTipo());
        func1.setSalario(3000);
        System.out.println(func1.getBonificacao());

        FuncionarioTeste func2 = new FuncionarioTeste();

        func2.setTipo(1);
        System.out.println(func2.getTipo());
        func2.setSalario(5000);

        System.out.println(func2.getBonificacao());
    }
}
