package br.com.maratonajava.date.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        float valor = 1235.785f;
        Locale locale = new Locale("JP");
        Locale locIndia = new Locale("en", "IN");
        Locale locUS = new Locale("en", "US");
        Locale locFrance = new Locale("fr", "FR");
        Locale locChina = new Locale("zh", "CN");

        NumberFormat[] nfa = new NumberFormat[8];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locale);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locale);
        nfa[4] = NumberFormat.getCurrencyInstance(locIndia);
        nfa[5] = NumberFormat.getCurrencyInstance(locUS);
        nfa[6] = NumberFormat.getCurrencyInstance(locFrance);
        nfa[7] = NumberFormat.getCurrencyInstance(locChina);


        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }
    }
}
