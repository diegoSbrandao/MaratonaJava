package br.com.maratonajava.padroesdeprojeto.testes;


import br.com.maratonajava.padroesdeprojeto.classes.Moeda;
import br.com.maratonajava.padroesdeprojeto.classes.MoedaFactory;
import br.com.maratonajava.padroesdeprojeto.classes.Pais;

public class MoedaFactoryTeste {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(Pais.EUA);
        System.out.println(moeda.getSimbolo());
    }
}

