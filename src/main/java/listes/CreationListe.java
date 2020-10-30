package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 1; i < 101; i++) {
            arrayList.add(i);
        }

        for(Integer elem: arrayList){
            System.out.println(elem);
        }
    }
}
