package models;

public class Conta implements IConta{

    private static final int AGENCIA_PADAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if(valor > saldo) {
            saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0){
            saldo += valor;
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(valor > 0){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }
}
