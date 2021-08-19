package br.com.maratonajava.generics.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MetodoGenericoTeste {
    public static void main(String[] args) {
        criarArray(new Cachorro());
    }

    public static <T extends Animal> void criarArray(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
    }
}
