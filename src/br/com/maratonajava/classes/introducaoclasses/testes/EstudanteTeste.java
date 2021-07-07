package br.com.maratonajava.classes.introducaoclasses.testes;

import br.com.maratonajava.classes.introducaoclasses.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.setNome("Diego");
        estudante.setIdade(32);

        estudante.setNotas(new double[]{9, 9, 10});
        estudante.notasMedia();

        System.out.println(estudante.getNome());
        System.out.println(estudante.getIdade());

        estudante.setIdade(-5);
        //System.out.println(estudante.getIdade());
    }
}
