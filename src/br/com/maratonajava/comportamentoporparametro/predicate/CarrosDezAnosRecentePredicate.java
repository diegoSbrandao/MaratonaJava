package br.com.maratonajava.comportamentoporparametro.predicate;

import br.com.maratonajava.comportamentoporparametro.classes.Carro;
import br.com.maratonajava.comportamentoporparametro.interfaces.CarroPredicate;

import java.util.Calendar;

public class CarrosDezAnosRecentePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
    }
}

