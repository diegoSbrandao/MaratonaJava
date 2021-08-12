package br.com.maratonajava.colecoes.testes;

import br.com.maratonajava.colecoes.classe.Celular;

public class EqualsTeste {
    public static void main(String[] args) {
        String nome = "Diego Brandão";
        String nome2 = new String("Diego Brandão");
        Integer int1 = 5;
        Integer int2 = new Integer(5);
        System.out.println(nome.equals(nome2));
        System.out.println(int1.equals(int2));

        Celular c1 = new Celular("iPhone","3456");
        Celular c2 = new Celular("iPhone","3456");
        System.out.println(c1.equals(c2));





    }
}
