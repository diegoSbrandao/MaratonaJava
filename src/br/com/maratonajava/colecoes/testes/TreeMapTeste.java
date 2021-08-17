package br.com.maratonajava.colecoes.testes;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTeste {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(map.headMap("C", true));
        System.out.println(map.higherEntry("C"));
        System.out.println(map.descendingMap());
    }
}


