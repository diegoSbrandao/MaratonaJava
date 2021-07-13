package br.com.maratonajava.enumeracao.testes;

import br.com.maratonajava.enumeracao.classes.Cliente;
import br.com.maratonajava.enumeracao.classes.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente("Diego", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.AVISTA);
        System.out.println(c);
        System.out.println("---------------------");
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
    }
}
