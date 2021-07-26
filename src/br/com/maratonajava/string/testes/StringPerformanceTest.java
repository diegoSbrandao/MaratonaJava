package br.com.maratonajava.string.testes;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
//      concatString(300000);
        long fim = System.currentTimeMillis();
//        System.out.println("Tempo total, String: "+(fim-inicio)+" ms");

        System.out.println("--------------------");

        inicio = System.currentTimeMillis();
        concatStringBuilder(30000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo total, String Builder: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(30000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo total, String Buffer: " + (fim - inicio) + " ms");




    }

    public static void concatString(int tam) {
        String string = "";
        for (int i = 0; i < tam; i++) {
            string += i;
        }
    }

    public static void concatStringBuilder(int tam) {
        StringBuilder ab = new StringBuilder(tam);
        for (int i = 0; i < tam; i++) {
            ab.append(i);
        }
    }

    public static void concatStringBuffer(int tam) {
        StringBuffer cd = new StringBuffer(tam);
        for (int i = 0; i < tam; i++) {
            cd.append(i);
        }
    }
}
