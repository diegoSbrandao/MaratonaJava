package br.com.maratonajava.polimorfismo.classes;

public class ArquivoDAOImp implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados nos arquivos");
    }
}
