package br.com.maratonajava.sobrecargaconstrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    public Estudante() {

    }

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;
    }


    public void imprime() {
        System.out.println("Nome = " + this.nome);
        System.out.println("Matrícula = " + this.matricula);
        for (double aux : this.notas) {
            System.out.println(" Nota = " + aux);
        }
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }
}
