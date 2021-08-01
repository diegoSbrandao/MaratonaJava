package br.com.maratonajava.date.teste;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTeste {
    public static void main(String[] args) {
        Date date = new Date();
       // System.out.println(date.getTime());

        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println("Dia da Semana: " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do Mês: " +c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia do Ano: " +c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Hora atual: " +c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minutos atual: " +c.get(Calendar.MINUTE));

        c.add(Calendar.HOUR,15); //Adicionando horas
        c.roll(Calendar.HOUR,15); //Adicionando horas ,mas, no mesmo dia,mes,ano

        Date date2 = c.getTime();
        System.out.println(date2);

    }
}
