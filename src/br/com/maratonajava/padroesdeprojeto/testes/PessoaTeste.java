package br.com.maratonajava.padroesdeprojeto.testes;

import br.com.maratonajava.padroesdeprojeto.classes.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder("Diego")
                .nomeDoMeio("Sousa")
                .ultimoNome("Brandao")
                .nomeDoPai("Jose")
                .apelido("LordSith")
                .build();
        System.out.println(p);
    }
}
