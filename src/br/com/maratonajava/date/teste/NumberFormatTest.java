package br.com.maratonajava.date.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        float valor = 1235.785f;
        Locale locale = new Locale("JP");
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locale);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locale);

        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }
    }
}
