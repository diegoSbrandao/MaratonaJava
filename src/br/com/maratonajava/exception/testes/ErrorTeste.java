package br.com.maratonajava.exception.testes;

public class ErrorTeste {
    public static void main(String[] args) {
    stackOverflowError();
    }
    public static void stackOverflowError(){
        stackOverflowError();
    }
}
