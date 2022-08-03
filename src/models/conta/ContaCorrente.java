package models.conta;

import models.usuario.User;

public class ContaCorrente extends Conta{

    public ContaCorrente(Banco banco, User usuario) {
        super(banco, usuario);
    }
}
