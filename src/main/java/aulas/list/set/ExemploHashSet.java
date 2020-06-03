package aulas.list.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        //Adicionado notas dos Alunos ( OBS: Por padrão não garante a ordem )
        notasAlunos.add(6.5);
        notasAlunos.add(9.8);
        notasAlunos.add(5.1);
        notasAlunos.add(7.3);
        notasAlunos.add(10.0);
        notasAlunos.add(3.9);
        notasAlunos.add(5.9);
        notasAlunos.add(8.5);

        System.out.println(notasAlunos);

        //Remove a nota do set
        notasAlunos.remove(3.9);

        //Retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());

        // informa todos os itens do iterator
        Iterator<Double> Iterator = notasAlunos.iterator();

       for (Double nota:notasAlunos){
           System.out.println(nota);
       }

    }
}
