package br.com.maratonajava.exception.runtime.testes;

import br.com.maratonajava.exception.checkedexception.Leitor1;
import br.com.maratonajava.exception.checkedexception.Leitor2;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        lerArquivo();

    }

    public static void lerArquivo() { //Como é a partir do java 7
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void lerArquivoOld() { //Como era no java 6
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("texto.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader == null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
