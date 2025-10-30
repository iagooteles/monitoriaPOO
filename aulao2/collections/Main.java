package aulao2.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Ana"); // List permite duplicatas

        for (String nome : nomes) {
            System.out.println("Nome da pessoa" + nome);
        }

        System.out.println("Tamanho da lista: " + nomes.size());
        System.out.println("Contém Bruno? " + nomes.contains("Bruno"));

        nomes.remove("Ana"); // remove a primeira ocorrência
        System.out.println("Lista após remover Ana: " + nomes);
    }
}
