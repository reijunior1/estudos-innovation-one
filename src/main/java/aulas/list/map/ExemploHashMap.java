package aulas.list.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        //Adiciona os campeões mundiais de clube da Fifa

        campeoesMundialFifa.put("Corinthians", 2);
        campeoesMundialFifa.put("Santos", 1);
        campeoesMundialFifa.put("São Paulo", 1);
        campeoesMundialFifa.put("Barcelona", 2);
        campeoesMundialFifa.put("Real Madrid", 3);
        campeoesMundialFifa.put("Liverpool", 1);
        campeoesMundialFifa.put("Milan", 1);
        campeoesMundialFifa.put("Manchester United", 1);


        //Atualiza o valor para a chave Santos
        campeoesMundialFifa.put("Santos", 2);

        //Retorna se exite ou não campeão
        System.out.println(campeoesMundialFifa.containsKey("Palmeiras"));

        // Remove a chave Milan
        campeoesMundialFifa.remove("Milan");

        // Retorna se existe ou não algum time penta campeão
        System.out.println(campeoesMundialFifa.containsValue(5));

        //Retorna o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());

        //Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry: campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey() + "----" + entry.getValue());
        }

        // Navega nos registros do mapa
        for (String key: campeoesMundialFifa.keySet()){
            System.out.println(key + "----" + campeoesMundialFifa.get(key));
        }

        // Verifica se o mapa contem a chave Bahia
        System.out.println(campeoesMundialFifa.containsKey("Bahia"));

        // Verifica se o mapa contem o valor 5
        System.out.println(campeoesMundialFifa.containsValue(5));

        // Limpa os registros
        campeoesMundialFifa.clear();

        System.out.println(campeoesMundialFifa);


    }
}
