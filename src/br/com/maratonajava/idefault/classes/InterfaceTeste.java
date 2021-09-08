package br.com.maratonajava.idefault.classes;


import br.com.maratonajava.idefault.interfaces.MyList;

import java.util.Collections;
import java.util.List;


public class InterfaceTeste implements MyList {
    public static void main(String[] args) {
        MyList.sort();
        new InterfaceTeste().remove();
    }


    @Override
    public void add() {
        System.out.println("dentro do add");
    }

}

