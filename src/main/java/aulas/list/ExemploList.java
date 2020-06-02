package aulas.list;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Reinaldo");
        nomes.add("Patricia");
        nomes.add("Christian");
        nomes.add("Rubi");
        nomes.add("Gato");


        nomes.set(0, "Reinaldo Couto");
        nomes.set(1, "Patricia Couto");
        nomes.set(2, "Christian Couto");
        System.out.println(nomes);

        Collections.sort(nomes);//nomes em ordem alfabetica.

        System.out.println(nomes);


    }
}
