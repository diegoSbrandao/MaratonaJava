package br.com.maratonajava.string.testes;

public class StringTeste {
    public static void main(String[] args) {
        String nome = "Diego";  //Usar desta forma, seria "boas práticas"
        nome = nome.concat(" Brandao");
        String nome2 = "Diego";
        String nome3 = new String("Catarina"); //Ao fazer isso, estamos criando ao mesmo tempo:
                                                       // 1-Variável de referência;
                                                       // 2-Um objeto do tipo String;
                                                       // 3-Uma String no pool de String;

        System.out.println(nome);

    }

}
