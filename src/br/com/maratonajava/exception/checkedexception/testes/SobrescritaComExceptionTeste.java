package br.com.maratonajava.exception.checkedexception.testes;

import br.com.maratonajava.exception.checkedexception.Funcionario;
import br.com.maratonajava.exception.checkedexception.Pessoa;
import br.com.maratonajava.exception.customexception.LoginInvalidoException;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Pessoa pessoa = new Pessoa();

        funcionario.salvar();
        try {
            pessoa.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
