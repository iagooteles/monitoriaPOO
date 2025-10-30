package aulao2.collections;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();

        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Ana"); // duplicata, não será adicionada

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("Contém Bruno? " + nomes.contains("Bruno"));

        nomes.remove("Carlos");
        System.out.println("Set após remover Carlos: " + nomes);
    }
}
