package br.com.maratonajava.classesabstratas.classes;

public abstract class Pessoa {
    protected String nome;

    public abstract void imprimi();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
