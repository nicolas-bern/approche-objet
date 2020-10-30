package listes;

import java.util.ArrayList;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> maListe = new ArrayList<String>();
        int count = 0;
        String maxVille = null;
        String newVille;

        maListe.add("Nice");
        maListe.add("Carcassonne");
        maListe.add("Narbonne");
        maListe.add("Lyon");
        maListe.add("Foix");
        maListe.add("Pau");
        maListe.add("Marseille");
        maListe.add("Tarbes");

        for (int i = 0; i < maListe.size(); i++) {
            if (count < maListe.get(i).length()){
                maxVille = maListe.get(i);
                count = maListe.get(i).length();
            }
        }

        System.out.println("Ville avec le plus grand nombre de lettres : " + maxVille);

        for (int i = 0; i < maListe.size(); i++) {
            newVille = maListe.get(i).toUpperCase();
            maListe.set(i, newVille);
        }

        System.out.println("Villes en majuscule" + maListe);

        for (int i = 0; i < maListe.size(); i++) {
            if(maListe.get(i).indexOf('N', 0) == 0){
                maListe.remove(i);
            }
        }

        System.out.println("Liste sans les villes commençant par 'N' : " + maListe);



        ArrayList<Ville> mesVilles = new ArrayList<Ville>();
        mesVilles.add(new Ville("Nice", 343_000));
        mesVilles.add(new Ville("Carcassonne", 47_800));
        mesVilles.add(new Ville("Narbonne", 53_400));
        mesVilles.add(new Ville("Lyon", 484_000));
        mesVilles.add(new Ville("Foix", 9_700));
        mesVilles.add(new Ville("Pau", 77_200));
        mesVilles.add(new Ville("Marseille", 850_700));
        mesVilles.add(new Ville("Tarbes", 40_600));

        int nbMax = 0;
        String nomVille = "";
        for (int i = 0; i < mesVilles.size(); i++) {
            if(nbMax < mesVilles.get(i).getNbHabitants()){
                nbMax = mesVilles.get(i).getNbHabitants();
                nomVille = mesVilles.get(i).getNom();
            }
        }

        System.out.println("La ville la plus peuplée est : " + nomVille);

        nbMax = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < mesVilles.size(); i++) {
            if (nbMax > mesVilles.get(i).getNbHabitants()){
                index = i;
                nbMax = mesVilles.get(i).getNbHabitants();
                nomVille = mesVilles.get(i).getNom();
            }
        }

        mesVilles.remove(index);
        System.out.println("Suppression de : " + nomVille);
        System.out.println("Liste sans ville la moins peuplée : " + mesVilles);


        for (int i = 0; i < mesVilles.size(); i++) {
            if(mesVilles.get(i).getNbHabitants() > 100_000){
                mesVilles.get(i).upCase(mesVilles.get(i).getNom());
            }
        }

        System.out.println(mesVilles);
    }




}
