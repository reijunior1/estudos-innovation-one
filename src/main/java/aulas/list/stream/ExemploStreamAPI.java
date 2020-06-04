package aulas.list.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class ExemploStreamAPI {
    public static void main (String[]args){
        List<String> estudantes = new ArrayList<>();

        //cria a coleção de estudantes
        estudantes.add("Reinaldo");
        estudantes.add("Patricia");
        estudantes.add("Christian");
        estudantes.add("Reinaldo Couto");
        estudantes.add("Patricia Couto");
        estudantes.add("Christian Couto");

        // Retorna a contagem de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());

        //Retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com menor numero de letras
        System.out.println("Menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorna os elementos que tem a letra R no nome
        System.out.println("Com Letra r no nome " + estudantes.stream().filter((estudante) ->
        estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retorna uma nova coleção com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat("--").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros da lista" +
                estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println("Retorna os elementos " +
                estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retorna os elementos novamente ");
            estudantes.stream().forEach(System.out::println);

        //Retorna True se todos os elementos possuem a letra Y no nome
        System.out.println("Tem algum elemento com a letra Y ? " +
                estudantes.stream().allMatch((elemento) -> elemento.contains("Y")));

        // Exemplo operação encadeada
        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream()
            .peek(System.out::println)
            .map(estudante ->
                    estudante.concat("--").concat(String.valueOf(estudante.length())))
            .peek(System.out::println)
            .filter((estudante) ->
                    estudante.toLowerCase().contains("r"))
            .collect(Collectors.toList()));

        System.out.println(" Retorna os " + estudantes.stream().noneMatch(estudante -> estudante.length() >=10));

        }
    }

