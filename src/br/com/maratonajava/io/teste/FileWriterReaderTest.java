package br.com.maratonajava.io.teste;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    public static void main(String[] args) throws IOException {
        try {


            //Para escrever no arquivo
            FileWriter fw = new FileWriter("C:\\Users\\diego\\Desktop\\Arquivo_Aula_Java.txt");
            fw.write("Escrevendo uma mensagem\npulou linha mahh oeee");
            fw.flush();
            fw.close();

            //Para Ler o arquivo
            FileReader fr = new FileReader("C:\\Users\\diego\\Desktop\\Arquivo_Aula_Java.txt");
            char[] texto = new char[500];
            int size = fr.read(texto);
            System.out.println("tamanho " + size);
            for (char c : texto) {
                System.out.print(c);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
