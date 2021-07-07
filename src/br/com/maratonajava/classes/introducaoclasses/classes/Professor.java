package br.com.maratonajava.classes.introducaoclasses.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprime(){
        System.out.println("---------------");
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.rg);
        System.out.println(this.cpf);
    }

}
