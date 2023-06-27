public abstract class Conta {
    //atributos de conta
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

//    public Conta(){}

    //construtor
    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O total de contas é: " + Conta.total);
        if (agencia <= 0)
            this.agencia = agencia;
        this.numero = numero;

        System.out.println("estou criando um conta " + this.numero);

    }

    public abstract void deposita(double valor);
//    {
////        this.saldo += valor;
//
//    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }


    public boolean transfere(double valor, Conta destino) {
        if(this.saca(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }


    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não pode valor menor ou igual a Zero");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode valor menor ou igual a Zero");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return total;
    }
}