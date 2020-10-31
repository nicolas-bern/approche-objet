package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {
    public static void main(String[] args) {

        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");
        //TODO Développements à réaliser ci-dessous

        System.out.println("Taille de la map : " + mapVilles.size());
        //System.out.println(mapVilles.keySet());
        //System.out.println(mapVilles.values());

        for (int elem: mapVilles.keySet()){
            System.out.println(elem);
        }

        for (String elem: mapVilles.values()){
            System.out.println(elem);
        }


    }
}
