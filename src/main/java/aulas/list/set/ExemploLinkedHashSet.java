package aulas.list.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Adiciona os numeros no set (OBS: Mantem a ordem dos elementos adicionado)
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(12);
        sequenciaNumerica.add(9);
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);
    }

}
    // Adiciona os numeros no set

