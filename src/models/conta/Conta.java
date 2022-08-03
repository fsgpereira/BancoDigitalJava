package models.conta;

import models.usuario.User;

public class Conta implements IConta {

    private static final int AGENCIA_PADAO = 1;
    private static int SEQUENCIAL = 1;

    protected Banco banco;
    protected User usuario;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(Banco banco, User usuario) {
        this.banco = banco;
        this.usuario = usuario;
        this.agencia = AGENCIA_PADAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println(String.format("Saldo insuficiente! Seu saldo atual é de: %.2f", saldo));
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

    public void extratoBancario(){
        System.out.println("===Extrato bancario===");
        System.out.println(String.format("  --Titular: %s",this.usuario.getNome() + " " + this.usuario.getSobrenome()));
        System.out.println(String.format("  --Agencia: %d",this.agencia));
        System.out.println(String.format("  --Conta: %d",this.numero));
        System.out.println(String.format("  --Saldo: %.2f",saldo));
        System.out.println("===Fim do Extrato ===\n");


    }
}
