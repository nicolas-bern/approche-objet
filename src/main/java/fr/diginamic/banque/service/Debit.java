package fr.diginamic.banque.service;

public class Debit extends Operation {

    public Debit(String dateOperation, int montant) {
        super(dateOperation, montant);
    }

    @Override
    public String afficherType() {
        return "Debit " + super.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
