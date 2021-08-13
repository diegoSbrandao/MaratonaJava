package br.com.maratonajava.colecoes.testes;

import br.com.maratonajava.colecoes.classe.Produto;

import java.util.*;

class ProdutoNomeComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto o1, Produto o2) {
        //return o1.getNome().compareTo(o2.getNome()); // Ordem crescente
        return o2.getNome().compareTo(o1.getNome());   // Ordem decrescente
    }
}

public class SortProdutoTeste {
    public static void main(String[] args) {
        Produto[] produtoArray = new Produto[4];
        Produto produto1 = new Produto("123", "Laptop Lenovo", 3500.99);
        Produto produto2 = new Produto("568", "Picanha", 35.99);
        Produto produto3 = new Produto("021", "Teclado Razer", 1000.99);
        Produto produto4 = new Produto("986", "Samsung galaxy S7", 2500.99);

//        List<Produto> produtoList = new ArrayList<>();
//        produtoList.add(produto1);
//        produtoList.add(produto2);
//        produtoList.add(produto3);
//        produtoList.add(produto4);
//
//        for (Produto list : produtoList) {
//            System.out.println(list);
//        }
//
//        System.out.println("-------");
//        System.out.println("Ordenação");
//        System.out.println("--------");
//
//        Collections.sort(produtoList);
//
//        for (Produto list : produtoList) {
//            System.out.println(list);
//        }

        produtoArray[0] = produto1;
        produtoArray[1] = produto2;
        produtoArray[2] = produto3;
        produtoArray[3] = produto4;

        System.out.println("Array");
        System.out.println("Array Sem Ordenação");

        for(Produto product : produtoArray){
            System.out.println(product);
        }

        System.out.println("-------------------");
        System.out.println("Array Com Ordenação");
        Arrays.sort(produtoArray,new ProdutoNomeComparator());

        for(Produto product : produtoArray){
            System.out.println(product);
        }



    }
}