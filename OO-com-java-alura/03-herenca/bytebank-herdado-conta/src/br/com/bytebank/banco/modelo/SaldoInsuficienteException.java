package br.com.bytebank.banco.modelo;
public class SaldoInsuficienteException extends Exception{//unchecked
    public SaldoInsuficienteException (String msg){
        super(msg);
    }
}
