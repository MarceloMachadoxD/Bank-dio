package com.github.marcelomachadoxd.entities;

public interface ContaOperations {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta destino);
}
