package br.com.maratonajava.idefault.interfaces;

public interface A {
    default void oi(){
        System.out.println("Dentro do oi de A");
    }
}

