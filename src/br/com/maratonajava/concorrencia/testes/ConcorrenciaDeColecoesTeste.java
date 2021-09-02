package br.com.maratonajava.concorrencia.testes;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class ConcorrenciaDeColecoesTeste {
    public static void main(String[] args) {
        // ConcurrentHashMap // estudar certificação
        // ConcurrentLinkedDeque // estudar certificação
        // ConcurrentLinkedQueue // estudar certificação
        // ConcurrentSkipListMap // estudar certificação
        // ConcurrentSkipListSet // estudar certificação

        ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "1");
        map.putIfAbsent("1", "2");
        System.out.println(map.get("1"));



    }
}
