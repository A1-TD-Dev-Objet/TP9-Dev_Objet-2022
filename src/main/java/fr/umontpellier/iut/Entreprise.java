package fr.umontpellier.iut;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Entreprise {
    private double bonusTotal;
    private Collection<Employe> lePersonnel;

    public Entreprise(){
        this.lePersonnel= new ArrayList<>();
    }

    public void embaucher(Employe e, LocalDate dateEmbauche) {
        e.setDateEmbauche(dateEmbauche);
        lePersonnel.add(e);
    }

    public void licencier(Employe e) {
        e.setDateEmbauche(null);
        lePersonnel.remove(e);
    }

    public Collection<Employe> getEmployesOrdonnes() {
        throw new RuntimeException("Méthode à implémenter");
    }

    public Collection<Employe> getEmployesDansDesordre() {
        throw new RuntimeException("Méthode à implémenter");
    }

    public double getBonusTotal() {
        return bonusTotal;
    }

    public void setBonusTotal(double bonusTotal) {
        this.bonusTotal = bonusTotal;
    }

    public void distribuerBonus() {
        throw new RuntimeException("Méthode à implémenter");
    }

    public void remercier(int n) {
        throw new RuntimeException("Méthode à implémenter");
    }

    public String toString(){
        ArrayList<Employe> personnel = new ArrayList<>();
        personnel.addAll(lePersonnel);
        String string = "";
        for (Employe employe:personnel){
            string += employe.toString();
        }
        return string;
    }
}
