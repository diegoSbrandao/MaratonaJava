package br.com.maratonajava.padroesdeprojeto.testes;

import br.com.maratonajava.padroesdeprojeto.classes.Aviao;

public class AviaoTeste {
    public static void main(String[] args) {
        agendarAssento("1A");
        agendarAssento("1A");
    }

    private static void agendarAssento(String assento) {
        Aviao a = new Aviao();
        System.out.println(a.bookAssento(assento));
    }
}
