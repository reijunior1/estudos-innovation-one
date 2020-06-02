package aulas.list;

import java.util.Queue;
import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia Couto");
        filaBanco.add("Reinaldo Couto");
        filaBanco.add("Christian Couto");
        filaBanco.add("Rei");
        filaBanco.add("Pat");
        filaBanco.add("Chris");

        System.out.println(filaBanco);
        
    }
}
