package br.com.maratonajava.padroesdeprojeto.testes;

import br.com.maratonajava.padroesdeprojeto.classes.AviaoSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AviaoSingletonTeste {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        agendarAssento("1A");
        agendarAssento("1A");
        AviaoSingleton aviaoSingleton = AviaoSingleton.getINSTANCE();
        AviaoSingleton aviaoSingleton2 = null;
        Constructor[] constructors = AviaoSingleton.class.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            constructor.setAccessible(true);
            aviaoSingleton2 = (AviaoSingleton) constructor.newInstance();
            break;
        }
        System.out.println(aviaoSingleton.hashCode());
        System.out.println(aviaoSingleton2.hashCode());
    }
    private static void agendarAssento(String assento) {
        AviaoSingleton a = AviaoSingleton.getINSTANCE();
        System.out.println(a.bookAssento(assento));
    }
}

