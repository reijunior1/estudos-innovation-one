package aulas.list;

import javax.xml.transform.sax.SAXSource;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Reinaldo"); // adcinando nomes na lista
        nomes.add("Patricia");
        nomes.add("Christian");
        nomes.add("Rubi");
        nomes.add("Gato");

        nomes.set(0, "Reinaldo Couto"); // alterando nomes da lista
        nomes.set(1, "Patricia Couto");
        nomes.set(2, "Christian Couto");
        System.out.println(nomes);

        Collections.sort(nomes);//nomes em ordem alfabetica.

        System.out.println(nomes);

        int posicao = nomes.indexOf("Patricia Couto"); // index.Of retorna a posição index do elemento
        int posicao1 = nomes.indexOf("Reinaldo"); // index.Of retorna a posição index do elemento, caso não encontre o elemento, o index será -1

        System.out.println(posicao);
        System.out.println(posicao1);

        nomes.remove(4);// remove o index da posição 4

        System.out.println(nomes);

        nomes.remove("Rubi"); // remove o elemento "Rubi" da lista

        System.out.println(nomes);

        String nome = nomes.get(0); // .get podemos atribuir uma variavel ao index 0 da lista

        System.out.println(nome);

        int tamanho = nomes.size(); // .size mostra a quantidade de elementos na lista

        System.out.println(tamanho);

        boolean existenome = nomes.contains("Patricia Couto"); // .contains se o elemento existe ou não na lista

        boolean existenome1 = nomes.contains("Patricia"); // .contains se o elemento existe ou não na lista

        nomes.add("Rubi");

        System.out.println(existenome);
        System.out.println(existenome1);

        for (String nomeDoItem: nomes){ // iterando de duas formas os elementos
            System.out.println("-->" + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator(); // utilizando metodo iterator

        while (iterator.hasNext()){
            System.out.println("---->>" + iterator.next());
        }

        nomes.clear(); // remove todos os elementos da lista

        boolean listavazia = nomes.isEmpty();

        System.out.println(listavazia);


    }
}
