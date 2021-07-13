package br.com.maratonajava.modificadorfinal.testes;

import br.com.maratonajava.modificadorfinal.classes.Carro;

public class CarroTeste {
    public static void main(String[] args){
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Diego");
        System.out.println(c.getComprador());

    }
}
