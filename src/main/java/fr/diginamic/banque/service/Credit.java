package fr.diginamic.banque.service;

public class Credit extends Operation {

    public Credit(String dateOperation, int montant) {
        super(dateOperation, montant);
    }

    @Override
    public String afficherType() {
        return "Crédit " + super.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
