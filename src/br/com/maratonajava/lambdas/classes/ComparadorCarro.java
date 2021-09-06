package br.com.maratonajava.lambdas.classes;

public class ComparadorCarro {
    public static int comparePorCor(Carro c1, Carro c2) {
        return c1.getCor().compareTo(c2.getCor());
    }

    public int comparePorAno(Carro c1, Carro c2) {
        return ((Integer) c1.getAno()).compareTo(c2.getAno());
    }
}
