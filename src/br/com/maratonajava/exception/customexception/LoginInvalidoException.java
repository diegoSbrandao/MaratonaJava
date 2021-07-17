package br.com.maratonajava.exception.customexception;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Usuário ou senha Inválidos");
    }
}
