package br.com.maratonajava.heranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização 1 - funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização 2 - funcionário");
    }

 static    {
        System.out.println("Dentro do bloco de inicialização - Static funcionário ");
    }

    public void print() {
        super.print();
        System.out.println("Salário: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + super.nome + ", recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
