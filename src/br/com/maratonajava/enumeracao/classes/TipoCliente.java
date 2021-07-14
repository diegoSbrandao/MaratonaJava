package br.com.maratonajava.enumeracao.classes;

public enum TipoCliente {
    //constant specific class body
    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica") {
        public String getId() {
            return "B";
        }
    };

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getId() {
        return "A";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

}
