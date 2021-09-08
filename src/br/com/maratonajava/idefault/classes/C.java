package br.com.maratonajava.idefault.classes;


import br.com.maratonajava.idefault.interfaces.A;
import br.com.maratonajava.idefault.interfaces.B;

public class C implements A, B {
    public static void main(String[] args) {
        new C().oi();
    }
    public void oi(){
        B.super.oi();
    }
}

