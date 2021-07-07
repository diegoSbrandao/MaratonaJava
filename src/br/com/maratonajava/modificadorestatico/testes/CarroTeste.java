package br.com.maratonajava.modificadorestatico.testes;

import br.com.maratonajava.modificadorestatico.classe.Carro;

public class CarroTeste {
    public static void main(String[] args){
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes", 290);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

        System.out.println("--------------------");

        Carro.velocidadeLimite =150;

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}
