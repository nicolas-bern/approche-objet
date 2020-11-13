package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int nbrAlea = 1+random.nextInt(100-1);
        int nbrCoups = 0;
        int nbrChoix = 0;
        String str;
        boolean isInt = false;
        boolean win = false;

        System.out.println("Trouvez le nombre entre 1 et 100");


        while (win != true){
            str = input.nextLine();

            try {
                nbrChoix = Integer.parseInt(str);
                isInt = true;
            } catch (NumberFormatException e){
                System.out.println("Cette valeur n'est pas un chiffre, essayez encore");
            }

            if (isInt == true){
                if (nbrChoix < nbrAlea){
                    System.out.println("Plus grand\n");
                    nbrCoups++;
                } else if (nbrChoix > nbrAlea){
                    System.out.println("Plus petit\n");
                    nbrCoups++;
                } else if (nbrChoix == nbrAlea){
                    nbrCoups++;
                    win = true;
                }
            }
        }
        System.out.println("Bravo ! Vous avez trouvé en " + nbrCoups + " coups.");
    }
}
