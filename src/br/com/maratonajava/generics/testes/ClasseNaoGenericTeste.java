package br.com.maratonajava.generics.testes;

import br.com.maratonajava.generics.classes.Carro;
import br.com.maratonajava.generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericTeste {
    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o carro por um mes");
        carroAlugavel.devolverCarro(carroAlugado);

        System.out.println(" -----------------------  ");
        ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
        Computador computador = computadorAlugavel.getComputadorDisponivel();
        System.out.println("Usando o PC");
        computadorAlugavel.devolverComputador(computador);
    }
}

class CarroAlugavel {
    private List<Carro> carrosDisponiveis = new ArrayList<>();

    {
        carrosDisponiveis.add(new Carro("Subaru"));
        carrosDisponiveis.add(new Carro("BMW"));
    }

    //Alugar
    public Carro getCarroDisponivel() {
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + c);
        System.out.println("Carros disponiveis: " + carrosDisponiveis);
        return c;
    }

    public void devolverCarro(Carro c) {
        System.out.println("Devolvendo carro: " + c);
        carrosDisponiveis.add(c);
        System.out.println("Carros disponiveis: " + carrosDisponiveis);
    }
}

class ComputadorAlugavel {
    private List<Computador> computadoresDisponiveis = new ArrayList<>();

    {
        computadoresDisponiveis.add(new Computador("Alienware"));
        computadoresDisponiveis.add(new Computador("HP"));
    }

    //Alugar
    public Computador getComputadorDisponivel() {
        Computador c = computadoresDisponiveis.remove(0);
        System.out.println("Alugando pc: " + c);
        System.out.println("PC disponiveis: " + computadoresDisponiveis);
        return c;
    }

    public void devolverComputador(Computador c) {
        System.out.println("Devolvendo PC: " + c);
        computadoresDisponiveis.add(c);
        System.out.println("PC disponiveis: " + computadoresDisponiveis);
    }
}