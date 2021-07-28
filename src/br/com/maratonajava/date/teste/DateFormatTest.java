package br.com.maratonajava.date.teste;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        DateFormat[] dfa = new DateFormat[6];
        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);

        for(DateFormat a : dfa) {
            System.out.println(a.format(c.getTime()));
        }
    }
}
