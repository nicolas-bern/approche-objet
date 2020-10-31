package maps;

import java.util.HashMap;

public class FusionMap {
    public static void main(String[] args) {
        // Création map1
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");

        // Création map2
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        // Création map3 = map1 + map2
        HashMap<Integer, String> map3 = new HashMap<>();
        String color = null;
        Integer key = 0;
        for (Integer elem: map1.keySet()){
            key = elem;
            color = map1.get(key);
            map3.put(key, color);
        }

        for (Integer elem: map2.keySet()){
            key = elem;
            color = map2.get(key);
            map3.put(key, color);
        }

        // Affichage map3
        System.out.println(map3.keySet());
        System.out.println(map3.values());
    }
}
