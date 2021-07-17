package br.com.maratonajava.exception.runtime.testes;

public class MultiplasRuntimeExceptionTeste {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IllegalArgumentException e ){
            System.out.println("Dentro do IllegalArgumentExceptio");
        }catch (ArithmeticException e ){
            System.out.println("Dentro do ArithmeticException");
        }
    }
}
