package br.com.maratonajava.classesabstratas.classes;

public class Vendedor extends Funcionario{
    private double totalVendas;

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public void calcularSalario() {
        this.salario = salario + (totalVendas * 0.05);
    }

    @Override
    public void imprimi() {
        System.out.println("Dentro da classe Vendedor");
    }
}
