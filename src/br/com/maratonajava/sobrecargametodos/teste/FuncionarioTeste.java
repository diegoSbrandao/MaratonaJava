package br.com.maratonajava.sobrecargametodos.teste;

import br.com.maratonajava.sobrecargametodos.classes.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args){
        Funcionario func = new Funcionario();
        func.imprime();
        System.out.println("-----------------------------------------");
        Funcionario func2 = new Funcionario("Diego","335.407.258-06",9500,"35-632-556-08");
        func2.imprime();



    }
}
