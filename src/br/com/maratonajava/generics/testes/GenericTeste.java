package br.com.maratonajava.generics.testes;

import java.util.ArrayList;
import java.util.List;

public class GenericTeste {
    public static void main(String[] args) {
        // type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Nelsolandia");
        lista.add("Irineu");
        lista.add("Diego Brandão");

        for (String obj : lista) {
            System.out.println(obj);
        }
        add(lista, 1L);
    }

    public static void add(List lista, Long l) {
        lista.add(l);
    }
}



