package br.com.maratonajava.heranca.classes;

public class Pessoa {
    protected String nome;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome) {
        System.out.println("Dentro do bloco do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    {
        System.out.println("Dentro do bloco de inicialização 1 - pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização 2 - pessoa ");
    }

 static    {
        System.out.println("Dentro do bloco de inicialização - Static - pessoa");
    }


    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco.getRua() + " \nBairro: " + this.endereco.getBairro());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
