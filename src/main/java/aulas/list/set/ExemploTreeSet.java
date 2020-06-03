package aulas.list.set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        //Mantem a ordem de  arvore de elementos Ordem Binaria

        treeCapitais.add("São Paulo");
        treeCapitais.add("Minas Gerais");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Bahia");
        treeCapitais.add("Rio Grande do Sul");
        treeCapitais.add("Parana");
        treeCapitais.add("Rio de Janeiro");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.first());

        //Retorna a ultima capital
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo da arvore de elementos parametrizado
        System.out.println(treeCapitais.lower("Florianópolis"));

        // Retorna a primeira capital acima na arvove da capital parametrizada
        System.out.println(treeCapitais.higher("Parana"));

        // Exibe todas as capitais
        System.out.println(treeCapitais);

        //Retorna a primeira capital do topo da arvore removendo do set
        System.out.println(treeCapitais.pollFirst());

        // Retorna a primeira capital no final da arvore removanedo do set
        System.out.println(treeCapitais.pollLast());


    }
}
