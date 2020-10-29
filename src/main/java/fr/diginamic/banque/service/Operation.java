package fr.diginamic.banque.service;

public abstract class Operation {

    protected String dateOperation;
    protected int montant;

    public Operation(String dateOperation, int montant){
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    public abstract String afficherType();

    public int getMontant() {
        return montant;
    }

    @Override
    public String toString() {
        return "dateOperation = '" + dateOperation + '\'' +
                ", montant = " + montant;
    }
}
