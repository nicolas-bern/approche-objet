package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str;
        boolean isInt = false;
        int nbr = 0;
        int somme = 0;

        System.out.println("Entrez un chiffre :");
        while (isInt != true){
            str = input.nextLine();
            try {
                nbr = Integer.parseInt(str);
                isInt = true;
            } catch (NumberFormatException e){
                System.out.println("Cette valeur n'est pas un chiffre, essayez encore");
            }
        }

        for (int i = 1; i <= nbr; i++) {
            somme+=i;
        }

        System.out.println("La somme de tous les entiers compris entre 1 et " + nbr + " est : " + somme);
    }
}
