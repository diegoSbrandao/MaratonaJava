package br.com.maratonajava.jdbc.classes;

import java.util.Objects;

public class Comprador {
    private Integer id;
    private String cpf;
    private String nome;

    public Comprador() {
    }

    public Comprador(Integer id, String cpf, String nome) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }

    public Comprador(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comprador comprador = (Comprador) o;
        return Objects.equals(id, comprador.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
