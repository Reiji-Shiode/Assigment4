package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("reina", "ren", "reo", "karen", "renald", "andy");
        List<String> result = names.stream().filter(name -> name.startsWith("r")).toList();
        System.out.println(result);
    }
}
