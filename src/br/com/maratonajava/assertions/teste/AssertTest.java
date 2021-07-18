package br.com.maratonajava.assertions.teste;

public class AssertTest {
    public static void main(String[] args) {
        calcularSalario(-5);
    }

    private static void calcularSalario(double salario){
        assert (salario > 0):"Erro, o salário deve ser mais que zero,\n salário digitado = " + salario;
        System.out.println(salario);
 }
}
