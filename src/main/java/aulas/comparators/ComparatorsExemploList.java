package aulas.comparators;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExemploList {
    public static void main(String[] args) {
       List<Estudante> estudantes = new ArrayList<>();

       estudantes.add(new Estudante("Reinaldo", 39));
       estudantes.add(new Estudante("Patricia", 42));
       estudantes.add(new Estudante("Christian", 5));
       estudantes.add(new Estudante("Eloisa", 60));
       estudantes.add(new Estudante("Reinaldo Couto", 68));
       estudantes.add(new Estudante("Luan", 13));
       estudantes.add(new Estudante("Rita", 60));
       estudantes.add(new Estudante("Wilson", 65));

        System.out.println("**---- Ordem de inserção do menor para o maior ----**");
       // ordem do menor para o maior das idades
      estudantes.sort((first,second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);

      System.out.println("**---- Ordem de inserção maior para o menor ----**");
        // ordem do maior para o menor das idades
        estudantes.sort((first,second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("**---- Ordem de natural dos numeros - idade (Method reference) ----**");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("**---- Ordem de natural dos numeros - idade (Method reference) ----**");
        System.out.println(estudantes);

        Collections.sort(estudantes);

        System.out.println("**---- Ordem de natural dos numeros - idade (interface Comparable) ----**");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        System.out.println("**---- Ordem de natural dos numeros - idade (interface Comparator) ----**");
        System.out.println(estudantes);


        }
    }

