package br.com.maratonajava.classesinternas.testes;

public class ClassesInternasTeste {

    private String nome = "Diego sith do DevDojo"; // enjoy the darkside

    class Interna {
        public void verClasseExterna() {
            System.out.println(nome);
            System.out.println(this);
            System.out.println(ClassesInternasTeste.this);
        }
    }

    public static void main(String[] args) {
        ClassesInternasTeste externa = new ClassesInternasTeste();
        ClassesInternasTeste.Interna in = externa.new Interna();
        ClassesInternasTeste.Interna in2 = new ClassesInternasTeste().new Interna();
        in.verClasseExterna();
//        in2.verClasseExterna();
    }
}


