package br.com.maratonajava.classes.introducaoclasses.testes;

import br.com.maratonajava.classes.introducaoclasses.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

    int[] array = new int[]{4,5,3};
    calc.somaArray(array);

    calc.somaVarargs(30,05,14);


    }
}
