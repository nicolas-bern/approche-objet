package fr.diginamic.banque;

import fr.diginamic.banque.service.Credit;
import fr.diginamic.banque.service.Debit;
import fr.diginamic.banque.service.Operation;

public class TestOperation {
    public static void main(String[] args) {

        Credit cre1 = new Credit("29/10", 30);
        Credit cre2 = new Credit("30/10", 40);
        Debit deb1 = new Debit("31/10", 50);
        Debit deb2 = new Debit("01/11", 60);

        int credTotal=0, debTotal=0, opeTotal=0;

        Operation[] mesOperations = {cre1, cre2, deb1, deb2};

        for (int i = 0; i < mesOperations.length; i++) {
            System.out.println(mesOperations[i].afficherType());
            if (mesOperations[i] instanceof Credit){
                credTotal += mesOperations[i].getMontant();
            } else {
                debTotal += mesOperations[i].getMontant();
            }
        }
        opeTotal = credTotal-debTotal;
        System.out.println("Crédit total : " + opeTotal);
    }
}
