package br.com.maratonajava.classes.introducaoclasses.testes;

import br.com.maratonajava.classes.introducaoclasses.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Jiraya";
        professor.matricula = "555.495";
        professor.rg = "35.632.556-8";
        professor.cpf = "335.407.258-06";

        Professor professor2 = new Professor();
        professor2.nome = "Wandeslery";
        professor2.matricula = "888.333";
        professor2.rg = "555.222.444-8";
        professor2.cpf = "999.111.333-06";

        professor.imprime();






    }
}
