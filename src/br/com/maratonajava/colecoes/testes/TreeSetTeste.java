package br.com.maratonajava.colecoes.testes;

import br.com.maratonajava.colecoes.classe.Produto;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("318", "Picanha", 55d, 10);
        Produto produto3 = new Produto("280", "Teclado Razer", 1200.0, 0);
        Produto produto4 = new Produto("357", "Samsung galaxy S9 64Gb", 2250.5, 0);
        Produto produto5 = new Produto("158", "Samsung galaxy S7 64Gb", 1000d, 0);
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.add(produto5);

        for (Produto produto : produtoNavigableSet.descendingSet()) {
            System.out.println(produto);
        }
        System.out.println("--------------------");
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollLast());
        System.out.println(produtoNavigableSet.size());
    }
}

