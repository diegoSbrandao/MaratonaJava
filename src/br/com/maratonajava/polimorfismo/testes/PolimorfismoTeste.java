package br.com.maratonajava.polimorfismo.testes;

import br.com.maratonajava.polimorfismo.classes.Funcionario;
import br.com.maratonajava.polimorfismo.classes.Gerente;
import br.com.maratonajava.polimorfismo.classes.RelatorioPagamento;
import br.com.maratonajava.polimorfismo.classes.Vendedor;

public class PolimorfismoTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("Irinelson",5000,2000);
        Vendedor v = new Vendedor("Goku",2000,20000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("------------------");
//        relatorio.relatorioPagamentoVendedor(v);

        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("------------------");
        relatorio.relatorioPagamentoGenerico(v);

//        Funcionario f = g;
//        System.out.println("#########################");
//        System.out.println(f.getSalario());

    }
}
