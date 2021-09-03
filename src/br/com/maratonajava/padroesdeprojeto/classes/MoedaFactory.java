package br.com.maratonajava.padroesdeprojeto.classes;

public class MoedaFactory {
    public static Moeda criarMoeda(Pais pais){
        if(pais.equals(Pais.BRAZIL)){
            return new Real();
        }else if(pais.equals(Pais.EUA)){
            return new USDolar();
        }
        throw new IllegalArgumentException("Nao existe esse pais");
    }
}
