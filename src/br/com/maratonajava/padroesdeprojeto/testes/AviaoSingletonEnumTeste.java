package br.com.maratonajava.padroesdeprojeto.testes;

import br.com.maratonajava.padroesdeprojeto.classes.AviaoSingletonEnum;

public class AviaoSingletonEnumTeste {
    public static void main(String[] args) {
        AviaoSingletonEnum.agendarAssento("1A");
        AviaoSingletonEnum.agendarAssento("1A");
    }
}
