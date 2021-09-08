package br.com.maratonajava.idefault.interfaces;

public interface B{
    default void oi(){
        System.out.println("Dentro do oi de B");
    }
}

