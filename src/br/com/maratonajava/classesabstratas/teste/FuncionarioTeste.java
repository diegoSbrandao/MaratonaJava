package br.com.maratonajava.classesabstratas.teste;

import br.com.maratonajava.classesabstratas.classes.Funcionario;
import br.com.maratonajava.classesabstratas.classes.Gerente;
import br.com.maratonajava.classesabstratas.classes.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {

        Gerente g = new Gerente("Anna", "2021-2", 2000);
        Vendedor v = new Vendedor("Camila", "2021-1", 1500, 5000);
        g.calcularSalario();
        v.calcularSalario();

        System.out.println(g);
        System.out.println("----------------------------------------------------");
        System.out.println(v);
        g.imprimi();
        v.imprimi();

    }
}