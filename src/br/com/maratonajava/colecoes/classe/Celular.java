package br.com.maratonajava.colecoes.classe;

import java.util.Objects;

public class Celular {
    private String nome;
    private String IMEI;

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

//    Reflexivo = x.equals(x) tem que ser true para tudo que for diferente de null;
//
//    Simetrico para x e y diferentes de null, se x.equals(y) == true logo y.equals(x) tem que ser true
//
//    Transitividade para x, y, z diferentes de null, se x.equals(y) == true, logo y.equals(x) == true e x.equals(z) == true logo y.equals(z) também tem que ser true
//
//    Consistente x.equals(y) deve sempre retornar o mesmo valor para x diferente de null x.equals(null) tem que retornar false;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Celular celular = (Celular) o;
        return Objects.equals(nome, celular.nome) && Objects.equals(IMEI, celular.IMEI);
    }

//    Para hashcode
//
//    Se x.equals(y) == true y.hashCode() == x.hashCode();
//    y.hashCode() == x.hashCode() não necessariamente o equals deverá retornar true;
//    x.equals(y) == false;
//    y.hashCode() != x.hashCode() x.equals(y) deverá ser false.



    @Override
    public int hashCode() {
        return Objects.hash(nome, IMEI);
    }

    public Celular() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }
}
