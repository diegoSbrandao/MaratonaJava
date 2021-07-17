package br.com.maratonajava.exception.checkedexception;

public class Leitor1 implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 1");

    }
}
