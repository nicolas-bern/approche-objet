package listes;

import java.util.ArrayList;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> maListe = new ArrayList<Integer>();

        maListe.add(-1);
        maListe.add(5);
        maListe.add(7);
        maListe.add(3);
        maListe.add(-2);
        maListe.add(4);
        maListe.add(8);
        maListe.add(12);

        System.out.println(maListe);
        System.out.println("Taille de la liste : " + maListe.size());

        int max = Integer.MIN_VALUE;
        for(int i=1; i<maListe.size(); i++){
            if(maListe.get(i)>maListe.get(i-1)) {
                max = maListe.get(i);
            }
        }

        System.out.println("Plus grand élément : " + max);

        int valeur = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<maListe.size(); i++){
            if(min>maListe.get(i)){
                min=i;
                valeur = maListe.get(i);
            }
        }
        System.out.println("L'élément à supprimer est : " + valeur);
        maListe.remove(min);
        System.out.println("Liste sans élément plus petit : " + maListe);


        int number;
        for(int i=0; i<maListe.size(); i++){
            if(maListe.get(i) < 0){
                number = maListe.get(i) * maListe.get(i);
                maListe.set(i, number);
            }
        }

        System.out.println("Liste avec que des éléments positifs" + maListe);

    }
}
