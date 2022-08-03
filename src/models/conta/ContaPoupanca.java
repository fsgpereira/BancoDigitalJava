package models.conta;

import models.usuario.User;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Banco banco, User usuario) {
        super(banco, usuario);
    }
}
