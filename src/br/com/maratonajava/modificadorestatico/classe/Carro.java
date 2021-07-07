package br.com.maratonajava.modificadorestatico.classe;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 240;

    public Carro(){
    }

    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimir(){
        System.out.println("----------------------");
        System.out.println("Marca: " + this.nome);
        System.out.println("Velocidade Máxima: " +this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
