package br.com.maratonajava.expressoesregulares.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " +   texto);
        System.out.println("indice: 0123456789");
        System.out.println("expressão: " + matcher.pattern());
        System.out.println("posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
