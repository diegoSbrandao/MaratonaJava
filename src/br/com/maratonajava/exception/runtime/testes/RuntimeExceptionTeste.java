package br.com.maratonajava.exception.runtime.testes;

public class RuntimeExceptionTeste {
    public static void main(String[] args) {
        System.out.println(divisao(10,0));

    }

    public static int divisao(int num1, int num2){
        if(num2==0){
            throw new IllegalArgumentException("Passe um valor diferente de 0 (zero) para num2");
        }
        return num1/num2;
    }
}
