package maps;

import java.util.HashMap;
import java.util.Map;

public class MapPays {
    public static void main(String[] args) {

        HashMap<String, Integer> mapPays = new HashMap<>();

        mapPays.put("USA", 328_239_523);
        mapPays.put("France", 67_848_156);
        mapPays.put("Allemagne", 83_149_300);
        mapPays.put("UK", 65_761_117);
        mapPays.put("Italie", 60_359_546);
        mapPays.put("Japon", 125_507_472);
        mapPays.put("Chine", 1_439_085_892);
        mapPays.put("Russie", 146_780_700);
        mapPays.put("Inde", 1_326_093_247);

        System.out.println(mapPays.keySet());

        int hab = Integer.MAX_VALUE;
        String country = null;
        for (Integer elem: mapPays.values()){
            if (hab > elem){
                hab = elem;
            }
        }

        for (String elem: mapPays.keySet()){
            if (hab == mapPays.get(elem)){
                country = elem;
            }
        }

        System.out.println("Pays avec la plus faible population : " + country + ", avec " + hab + " habitants.");
        mapPays.remove(country, hab);
        System.out.println(mapPays.keySet());
    }
}
