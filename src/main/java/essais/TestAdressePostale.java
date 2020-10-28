package essais;

import entites.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale(23, "rue d'Aquitaine", 44800, "Saint-Herblain");
        AdressePostale adr2 = new AdressePostale(77, "rue de Bretagne", 44700, "Sautron");

        System.out.println("Adresse 1 : \n" + adr1.getNumeroRue() + "\n" + adr1.getRueNom() + "\n" + adr1.getPostalCode() + "\n" + adr1.getNomVille());
        System.out.println("\n");
        System.out.println("Adresse 2 : \n" + adr2.getNumeroRue() + "\n" + adr2.getRueNom() + "\n" + adr2.getPostalCode() + "\n" + adr2.getNomVille());
    }
}
