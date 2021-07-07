package br.com.maratonajava.sobrecargaconstrutores.testes;

import br.com.maratonajava.sobrecargaconstrutores.classes.Estudante;

public class Teste {
    public static void main(String[] args){
        Estudante estudante = new Estudante("335.405","Diego",new double[]{5,6,8});

        estudante.imprime();

    }
}
