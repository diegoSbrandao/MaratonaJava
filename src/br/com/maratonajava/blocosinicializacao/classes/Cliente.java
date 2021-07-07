package br.com.maratonajava.blocosinicializacao.classes;

public class Cliente {
    private int[] parcelas;

    {
        parcelas = new int[100];
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
