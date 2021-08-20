package br.com.maratonajava.classesinternas.testes;

public class ClassesLocaisTeste {
    private String nome = "Diego";

    public void fazAlgumaCoisa() {
        String sobrenome = "Brandao";
        class Interna {
            public void imprimeNomeExterno() {
                System.out.println(nome);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();
    }

    public static void main(String[] args) {
        ClassesLocaisTeste externa = new ClassesLocaisTeste();
        externa.fazAlgumaCoisa();
    }
}

