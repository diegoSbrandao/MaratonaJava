package br.com.maratonajava.string.testes;

public class StringBuilderTeste {
    public static void main(String[] args) {
        String s = " Uma frase comum";
        StringBuilder ab = new StringBuilder(16);
       // ab.append("diego");
        System.out.println(ab.reverse());
        ab.append("012345");
//        System.out.println(ab.delete(0,3));
        System.out.println(ab.insert(4,"$$$"));

    }
}
