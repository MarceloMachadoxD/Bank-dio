package com.github.marcelomachadoxd.entities;

public class Cliente {
    private String nome;

    public Cliente(String cliente) {
        this.nome = cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
