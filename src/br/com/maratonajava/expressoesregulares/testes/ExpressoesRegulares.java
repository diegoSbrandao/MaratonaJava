package br.com.maratonajava.expressoesregulares.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {
    public static void main(String[] args) {
        int hex = 0x1;

//        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//        String texto = "12 0x 0X 0x01FFABC 0x10G 0x1";
//        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //([\\w\\.])+@([a-zA-Z])+(\.([a-zA-Z])+)+
//        String texto = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail.br, teste@gmail.com.br, teste@mail";
//        String regex = "\\d{2}/\\d{2}/\\d{2,4}"; //formato para validar datas, ps: utilize a classe classe DateFormat.
//        String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95"; // dd/MM/yyyy

        String regex = "proj([^,])*";
        String texto = "proj1.bkp, proj1.java, proj1.class, proj1final.java, proj2.bkp, proj3.java, diagrama, texto, foto"; // dd/MM/yyyy

//        System.out.println("Email valido? "+ "#@!abrao@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 012345678901234567");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("posicoes encontradas");
        while(matcher.find()){
            System.out.println(matcher.start() +" "+ matcher.group());
        }
    }
}




