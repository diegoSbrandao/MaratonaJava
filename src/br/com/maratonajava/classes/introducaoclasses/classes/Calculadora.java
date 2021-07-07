package br.com.maratonajava.classes.introducaoclasses.classes;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(5+5);
    }

    public void multiplicacao(int a, int b){
        System.out.println(a*b);
    }

    public int multiplicacao2(int a, int b){
        return a*b;
    }

    public double divisao(double num1, double num2){
        System.out.println(num1/num2);
        return num1/num2;
    }

    public void altera(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println(num1);
        System.out.println(num2);
    }
    public void somaArray(int[] numeros){
        int soma=0;
        for(int num:numeros){
            soma+=num;
        }
        System.out.println("O resultado da soma, Array normal = " + soma);
    }

    public void somaVarargs(int... numeros){
        int soma=0;
        for(int num:numeros){
            soma+=num;
        }
        System.out.println("O resultado da soma commaratonajava Varargs = " + soma);
    }

}
