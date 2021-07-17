package br.com.maratonajava.exception.customexception;

public class CustomExceptionTeste {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException{
        String usuarioBancoDeDados = "Goku";
        String senhaBancoDeDados = "333";
        String usuarioDigitado = "Naruto";
        String senhaDigitada = "333";

        if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }else{
            System.out.println("Login Efetuado com sucesso");
        }
    }
}
