package sets;

import java.util.Objects;

public class Pays {

    private String nom;
    private  int nbHbts;
    private int pibHbts;

    public Pays(String nom, int nbHbts, int pibHbts) {
        this.nom = nom;
        this.nbHbts = nbHbts;
        this.pibHbts = pibHbts;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHbts() {
        return nbHbts;
    }

    public int getPibHbts() {
        return pibHbts;
    }

    public String upCase(String nomPays){
        return nomPays.toUpperCase();
    }

    @Override
    public String toString() {
        return "{ " + nom + ": Nombre d'habitants = " + nbHbts + ", PIB/habitants = " + pibHbts + '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pays pays = (Pays) o;
        return nbHbts == pays.nbHbts &&
                pibHbts == pays.pibHbts &&
                Objects.equals(nom, pays.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbHbts, pibHbts);
    }
}
