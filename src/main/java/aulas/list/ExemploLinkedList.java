package aulas.list;

import java.util.Iterator;
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

        filaBanco.add("Rubi");


        String clienteASerAtendido = filaBanco.poll();// .poll remove o primeiro elemento da lista
        System.out.println(clienteASerAtendido); // cliente e a ser atendido
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();// .peek apenas retorna os elementos da lista
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        String primeiroClienteOuErro = filaBanco.element();// retornando erro quando não há elementos na lista

        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String cliente : filaBanco) {
            System.out.println("->>" + cliente);

        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println("-->>" + iteratorFilaBanco.next());
        }
        System.out.println(filaBanco.size()); // quantidade de elementos na fila
        System.out.println(filaBanco.isEmpty()); // retornando boolean se a lista está vazia.
    }
}
