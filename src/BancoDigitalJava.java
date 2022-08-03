import models.conta.Banco;
import models.conta.Conta;
import models.conta.ContaCorrente;
import models.conta.ContaPoupanca;
import models.usuario.User;

import java.util.Arrays;

public class BancoDigitalJava {
    public static void main(String[] args) {

        //criando o cadastro do banco
        Banco santander = new Banco(33,"Santander");

        //criando um usuario
        User gustavo = new User("Gustavo", "Pereira");

        //criando 2 contas vinculando o usuario e o banco
        Conta corrente = new ContaCorrente(santander, gustavo);
        Conta poupanca = new ContaPoupanca(santander, gustavo);


        //realizando deposito, saque e transferencia
        corrente.depositar(1000);
        corrente.sacar(200);
        corrente.transferir(500, poupanca);
        corrente.sacar(500);

        //visualizando extratos
        corrente.extratoBancario();
        poupanca.extratoBancario();

        //Tentativa de saque na conta corrente sem saldo
        corrente.sacar(200);

    }
}
