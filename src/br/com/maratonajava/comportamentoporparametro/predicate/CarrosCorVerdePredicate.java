package br.com.maratonajava.comportamentoporparametro.predicate;


import br.com.maratonajava.comportamentoporparametro.classes.Carro;
import br.com.maratonajava.comportamentoporparametro.interfaces.CarroPredicate;

public class CarrosCorVerdePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
    }
}
