package br.com.maratonajava.classesabstratas.classes;

public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void imprimi() {
        System.out.println("Dentro da classe Gerente");
    }

    @Override
    public void calcularSalario() {
        this.salario = salario + (salario * 0.2);
    }

}
