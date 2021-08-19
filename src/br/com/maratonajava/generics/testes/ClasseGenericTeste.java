package br.com.maratonajava.generics.testes;

import br.com.maratonajava.generics.classes.Carro;
import br.com.maratonajava.generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericTeste {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Subaru"));
        carrosDisponiveis.add(new Carro("BMW"));
        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
        Carro carro = carroAlugavel.getObjetoDisponivel();
        System.out.println("Usando o carro por um mes");
        carroAlugavel.devolverObjeto(carro);
        System.out.println("---------");

        List<Computador> computadoresDisponiveis = new ArrayList<>();
        computadoresDisponiveis.add(new Computador("Alienware"));
        computadoresDisponiveis.add(new Computador("HP"));
        ObjetosAlugaveis<Computador> computadorAlugavel = new ObjetosAlugaveis<>(computadoresDisponiveis);
        Computador c = computadorAlugavel.getObjetoDisponivel();
        System.out.println("Usando computador");
        computadorAlugavel.devolverObjeto(c);
    }
}

//Type
class ObjetosAlugaveis<T> {
    private List<T> objetosDiponiveis;
    public ObjetosAlugaveis(List<T> objetosDiponiveis) {
        this.objetosDiponiveis = objetosDiponiveis;
    }
    //Alugar
    public T getObjetoDisponivel() {
        T t = objetosDiponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponiveis: " + objetosDiponiveis);
        return t;
    }

    public void devolverObjeto(T t) {
        System.out.println("Devolvendo objeto: " + t);
        objetosDiponiveis.add(t);
        System.out.println("Objetos disponiveis: " + objetosDiponiveis);
    }
}

class DoisAtributs<T,X>{
    T um;
    X dois;

    public DoisAtributs(T um, X dois) {
        this.um = um;
        this.dois = dois;
    }

    public T getUm() {
        return um;
    }

    public void setUm(T um) {
        this.um = um;
    }

    public X getDois() {
        return dois;
    }

    public void setDois(X dois) {
        this.dois = dois;
    }
}
