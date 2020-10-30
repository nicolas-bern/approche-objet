package listes;

import java.util.List;
import java.util.ArrayList;

public class FusionListe {
    public static void main(String[] args) {
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List<String> listeFusion = new ArrayList<String>();
        for(String elem: liste1){
            listeFusion.add(elem);
        }

        for(String elem: liste2){
            listeFusion.add(elem);
        }

        System.out.println(listeFusion);
    }
}
