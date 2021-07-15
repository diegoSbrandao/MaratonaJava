package br.com.maratonajava.polimorfismo.classes;

public class DataBaseDAOImp implements GenericDAO{

    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados");

    }
}
