package br.com.maratonajava.exception.checkedexception.testes;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTeste {
    public static void main(String[] args) throws IOException {

        criarArquivo();

    }
    public static void criarArquivo() throws IOException {
        File file = new File("teste.txt");
        try {
            file.createNewFile();
            System.out.println("Arquivo Criado");
        }catch (IOException e){

        };
    }
}
