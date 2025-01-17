package com.aluracursos.springmatch.screenmatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraEjemplo(){
        List<String> nombres= Arrays.asList("Jean","Pedro","Pablo","Rodolfo","Jose","Amanda","Carlos");
        nombres.stream()
                .sorted()
                .limit(4)
                .filter(n-> n.startsWith("J"))
                .map(n->n.toUpperCase())
                .forEach(System.out::println);
    }
}
