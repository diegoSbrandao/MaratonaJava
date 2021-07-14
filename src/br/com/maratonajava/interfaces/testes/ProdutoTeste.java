package br.com.maratonajava.interfaces.testes;

import br.com.maratonajava.interfaces.classes.Produto;

import java.util.Locale;

public class ProdutoTeste {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Produto p = new Produto("TV",4,3000);
        System.out.println(p);
        System.out.println("------------");
        p.calcularImposto();
        p.calcularFrete();
        System.out.println(p);
    }
}
