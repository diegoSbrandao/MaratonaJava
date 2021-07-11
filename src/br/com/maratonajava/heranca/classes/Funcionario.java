package br.com.maratonajava.heranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public void print(){
        super.print();
        System.out.println("Salário: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
