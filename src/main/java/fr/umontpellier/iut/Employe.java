package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Employe implements Comparable<Employe>{
    private String nrINSEE;
    private String nom;
    private double base;

    private LocalDate dateEmbauche;

    private double bonus; // pour exo3

    private String adresse; // pour exo4

    public Employe(String nrINSEE, String nom, double base) {
        this.nrINSEE = nrINSEE;
        this.nom = nom;
        this.base = base;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nrINSEE='" + nrINSEE + '\'' +
                ", nom='" + nom + '\'' +
                ", base=" + base +
                ", bonus=" + bonus +
                ", dateEmbauche=" + dateEmbauche +
                "}\n";
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getMoisAnciennete() {
        long intervalleEnMois = ChronoUnit.MONTHS.between(dateEmbauche, LocalDate.now());
        return (int) intervalleEnMois;
    }

    public double getIndemniteTransport() throws AdresseInconnueException {

        try {
            GestionDistances.getDistance(adresse);
            return GestionDistances.getDistance(adresse)*base;
        } catch (AdresseInconnueException e) {
            return 0;
        }

    }


    public int compareTo(Employe e){
        if(this.nom.compareTo(e.nom)==0){
           return e.nrINSEE.compareTo(this.nrINSEE);
        }
        else {
            return this.nom.compareTo(e.nom);
        }
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return Objects.equals(nrINSEE, employe.nrINSEE) && Objects.equals(nom, employe.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrINSEE, nom);
    }
}
