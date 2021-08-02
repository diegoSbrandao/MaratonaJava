package br.com.maratonajava.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\diego\\Desktop\\Arquivo_Aula_Java.txt");
        try {
            file.createNewFile();
            System.out.println("Endereço do arquivo: " + file.getPath());
            System.out.println("Posso ler o arquivo: "+ file.canRead());
            System.out.println("O Arquivo existe: " +file.exists());
            System.out.println("Deletando o arquivo " + file.delete());
            System.out.println("Existe arquivo ? " + file.exists());
            System.out.println("Criando arquivo: " + file.createNewFile());
            System.out.println(new Date(file.lastModified()));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
