package sets;

import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {

        HashSet<String> hashCountry = new HashSet<String>();

        hashCountry.add("USA");
        hashCountry.add("France");
        hashCountry.add("Allemagne");
        hashCountry.add("UK");
        hashCountry.add("Italie");
        hashCountry.add("Japon");
        hashCountry.add("Chine");
        hashCountry.add("Russie");
        hashCountry.add("Inde");

        int count = 0;
        String maxPays = null;
        for (String elem: hashCountry){
            if(count < elem.length()){
                count = elem.length();
                maxPays = elem;
            }
        }
        System.out.println("Le pays qui a le plus de lettre est : " + maxPays);
        hashCountry.remove(maxPays);
        System.out.println(hashCountry);



        HashSet<Pays> hashPays = new HashSet<Pays>();

        hashPays.add(new Pays("USA", 328_239_523, 62_606));
        hashPays.add(new Pays("France", 67_848_156, 42_878));
        hashPays.add(new Pays("Allemagne", 83_149_300, 52_559));
        hashPays.add(new Pays("UK", 65_761_117, 43_620));
        hashPays.add(new Pays("Italie", 60_359_546, 37_970));
        hashPays.add(new Pays("Japon", 125_507_472, 42_659));
        hashPays.add(new Pays("Chine", 1_439_085_892, 16_624));
        hashPays.add(new Pays("Russie", 146_780_700, 28_712));
        hashPays.add(new Pays("Inde", 1_326_093_247, 5_174));

        int pibMax = Integer.MIN_VALUE;
        String country = null;
        for(Pays elem: hashPays){
            if(pibMax < elem.getPibHbts()){
                pibMax = elem.getPibHbts();
                country = elem.getNom();
            }
        }

        System.out.println("Le pays avec le PIB/habitant le plus haut est : " + country + " avec " + pibMax);


        int pibMin = Integer.MAX_VALUE;
        int nbHabs = 0;
        for(Pays elem: hashPays){
            if(pibMin > elem.getPibHbts()){
                pibMin = elem.getPibHbts();
                country = elem.getNom();
                nbHabs = elem.getNbHbts();
            }
        }

        Pays pays = new Pays(country, nbHabs, pibMin);
        hashPays.remove(pays);
        hashPays.add(new Pays(country.toUpperCase(), nbHabs, pibMin));

        System.out.println(hashPays);
    }
}
