package com.github.marcelomachadoxd;

import com.github.marcelomachadoxd.entities.Cliente;
import com.github.marcelomachadoxd.entities.Conta;
import com.github.marcelomachadoxd.entities.ContaCorrente;
import com.github.marcelomachadoxd.entities.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente(new Cliente("Marcelo"));
        Conta poupanca = new ContaPoupanca(new Cliente("Suelen"));

        cc.depositar(100);

        System.out.println("Saldo da conta corrente: " + cc);
        System.out.println("Saldo da conta poupança: " + poupanca);

        cc.transferir(50, poupanca);


        System.out.println("Saldo da conta corrente: " + cc);
        System.out.println("Saldo da conta poupança: " + poupanca);


    }
}
