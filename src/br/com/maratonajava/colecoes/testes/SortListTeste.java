package br.com.maratonajava.colecoes.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTeste {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Irineu");
        nomes.add("Jubileu");
        nomes.add("Diego");
        nomes.add("DevDojo");
        nomes.add("Batman");

//        for(String nome : nomes){
//            System.out.println(nome);
//        }
//        System.out.println();
//        System.out.println("--------------");
//        System.out.println("Com ordenação");
//        System.out.println("--------------");
//        System.out.println();
//
//        Collections.sort(nomes);
//
//        for(String nome : nomes){
//            System.out.println(nome);
//        }

        List<Double> numeros = new ArrayList<>();
        numeros.add(47.3);
        numeros.add(12.9);
        numeros.add(12.6);
        numeros.add(07.1);
        numeros.add(13.5);

        for(Double numero : numeros){
            System.out.println(numero);
        }
        System.out.println();
        System.out.println("--------------");
        System.out.println("Com ordenação");
        System.out.println("--------------");
        System.out.println();

        Collections.sort(numeros);

        for(Double numero : numeros){
            System.out.println(numero);
        }
    }
}
