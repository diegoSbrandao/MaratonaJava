package br.com.maratonajava.classes.introducaoclasses.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;

    public void notasMedia() {
        if(notas == null){
            System.out.println("Aluno sem notas");
            return;
        }
        double media = 0;
        for (double nota : this.notas) {
            media = media + nota;
        }
        media = media / this.notas.length;

        if (media >= 6) {
            System.out.println("Aprovado.");
            return;
        }
        System.out.println("Reprovado.");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0) {
            this.idade = idade;
        }
        System.out.println("Idade inválida");
        return;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
            this.notas = notas;
    }
}
