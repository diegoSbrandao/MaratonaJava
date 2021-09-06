package br.com.maratonajava.comportamentoporparametro.interfaces;


import br.com.maratonajava.comportamentoporparametro.classes.Carro;

@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
}

