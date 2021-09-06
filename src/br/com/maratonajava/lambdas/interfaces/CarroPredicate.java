package br.com.maratonajava.lambdas.interfaces;


import br.com.maratonajava.lambdas.classes.Carro;

@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
    // (parametro) -> <expressao>
    // (Carro carro) -> carro.getCor().equals("verde");
}

