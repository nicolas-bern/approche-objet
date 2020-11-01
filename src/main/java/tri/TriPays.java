package tri;

import sets.Pays;

import java.util.ArrayList;
import java.util.Collections;

public class TriPays {
    public static void main(String[] args) {

        ArrayList<Pays> listePays = new ArrayList<>();
        listePays.add(new Pays("USA", 328_239_523, 62_606));
        listePays.add(new Pays("France", 67_848_156, 42_878));
        listePays.add(new Pays("Allemagne", 83_149_300, 52_559));
        listePays.add(new Pays("UK", 65_761_117, 43_620));
        listePays.add(new Pays("Italie", 60_359_546, 37_970));
        listePays.add(new Pays("Japon", 125_507_472, 42_659));
        listePays.add(new Pays("Chine", 1_439_085_892, 16_624));
        listePays.add(new Pays("Russie", 146_780_700, 28_712));
        listePays.add(new Pays("Inde", 1_326_093_247, 5_174));

        listePays.sort(Pays::compareTo);
        System.out.println("Liste pays triée par ordre alphabétique : \n" + listePays);

        System.out.println("\n");

        Collections.sort(listePays, new ComparatorHabitant());
        System.out.println("Liste pays triée par ordre croissant nombre habitants : \n" + listePays);

        System.out.println("\n");

        Collections.sort(listePays, new ComparatorPibHabitant());
        System.out.println("Liste pays triée par ordre croissant PIB/hab : \n" + listePays);
    }
}
