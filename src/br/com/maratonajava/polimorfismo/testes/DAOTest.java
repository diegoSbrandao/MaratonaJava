package br.com.maratonajava.polimorfismo.testes;

import br.com.maratonajava.polimorfismo.classes.ArquivoDAOImp;
import br.com.maratonajava.polimorfismo.classes.GenericDAO;

import java.util.ArrayList;
import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImp();
        arquivoDAO.save();
        List<String> lista = new ArrayList<>();
        lista.add("Nome1");
        lista.add("Nome2");
        lista.add("Nome3");
        lista.add("Nome4");

        for(String nome : lista){
            System.out.println(nome);
        }
    }
}
