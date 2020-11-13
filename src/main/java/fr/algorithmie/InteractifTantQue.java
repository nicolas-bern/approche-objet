package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str;
        boolean isInt = false;
        int nbr = 0;

        System.out.println("Entrez un chiffre entre 1 et 10");
        while (isInt != true){
        str = input.nextLine();
        try {
            nbr = Integer.parseInt(str);
            isInt = true;
            while (nbr < 1 || nbr > 10){
                System.out.println("Entrez un chiffre entre 1 et 10");
                nbr = input.nextInt();
            }
        } catch (NumberFormatException e){
            System.out.println("Cette valeur n'est pas un chiffre, essayez encore");
            }
        }

        System.out.println("Votre chifre est : " + nbr);
    }
}
