package br.com.maratonajava.expressoesregulares.testes;

public class TokensTeste {
    public static void main(String[] args) {
        String str = "William2, Joana3, Camila4, John0, Matheus5, Diego9";
//        String[] tokens = str.split("[0-9],*");
        String[] tokens = str.split("[\\d],*");

        for(String arr: tokens){
            System.out.println(arr.trim());
        }
    }
}
