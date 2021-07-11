package br.com.maratonajava.heranca.testes;

import br.com.maratonajava.heranca.classes.Endereco;
import br.com.maratonajava.heranca.classes.Funcionario;
import br.com.maratonajava.heranca.classes.Pessoa;

public class HerancaTeste {
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        Endereco end = new Endereco();
        Funcionario func = new Funcionario();

        p.setNome("Diego");
        p.setCpf("555.444.333-11");
        end.setBairro("Chico de Paula");
        end.setRua("Travessa Brasil");
        p.setEndereco(end);

        func.setCpf("555");
        func.setNome("Irineu");
        func.setSalario(9500);
        func.setEndereco(end);




        p.print();
        System.out.println("--------------------");
        func.print();
        System.out.println("--------------------");
        System.out.println("--------------------");


    }
}
