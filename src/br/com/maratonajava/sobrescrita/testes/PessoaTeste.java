package br.com.maratonajava.sobrescrita.testes;

import br.com.maratonajava.sobrescrita.classes.Pessoa;

public class PessoaTeste {
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        p.setNome("Irineus");
        p.setIdade(123);

        Pessoa p2 = new Pessoa();
        p2.setNome("Aderlindo");
        p2.setIdade(36);

        System.out.println(p);
        System.out.println(p2);

    }
}
