package br.com.maratonajava.interfaces.classes;

public class Produto implements Tributavel, Transportavel {
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;

    @Override
    public void calcularImposto() {
        precoFinal = this.preco + (this.preco * IMPOSTO);
    }

    @Override
    public void calcularFrete() {
        this.valorFrete = this.preco / peso * 0.1;
    }

    @Override
    public String toString() {
        return "Produto:" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", Valor do Frete: " + String.format("%.2f",valorFrete)+
                ", Valor Final com Imposto: " + precoFinal;
    }

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }


}
