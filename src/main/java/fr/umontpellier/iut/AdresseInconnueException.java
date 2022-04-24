package fr.umontpellier.iut;

public class AdresseInconnueException extends Exception{
    private String nomVille;

    public AdresseInconnueException(String nomVille) {
        super("La ville " + nomVille + " n'existe pas");
    }
}
