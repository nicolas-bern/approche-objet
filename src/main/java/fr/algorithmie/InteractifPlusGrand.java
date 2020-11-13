package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {

        int[] array = new int[10];

        Scanner input = new Scanner(System.in);
        String str;
        boolean isInt = false;
        int nbr = 0;
        int nbrMax = Integer.MIN_VALUE;
        int i = 0;

        System.out.println("Entrez 10 chiffres :");
        while (i <= 9) {
            str = input.nextLine();

            try {
                nbr = Integer.parseInt(str);
                isInt = true;
            } catch (NumberFormatException e){
                System.out.println("Cette valeur n'est pas un chiffre, essayez encore");
            }

            if (isInt == true){
                array[i] = nbr;
                isInt = false;
                i++;
            }
        }

        for (int elem: array){
            if (nbrMax < elem){
                nbrMax = elem;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("La valeur la plus grande du tableau est : " + nbrMax);


    }
}
