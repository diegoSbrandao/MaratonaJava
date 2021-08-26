package br.com.maratonajava.jdbc;
import br.com.maratonajava.jdbc.classes.Carro;

import java.util.List;

public interface CarroDAO {
    void update(Carro carro);

    void save(Carro carro);

    void delete(Carro carro);

    List<Carro> selectAll();

    List<Carro> searchByName(String nome);
}

