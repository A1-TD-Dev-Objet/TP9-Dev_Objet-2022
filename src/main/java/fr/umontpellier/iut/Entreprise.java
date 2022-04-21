package fr.umontpellier.iut;

import com.sun.source.util.Trees;

import java.time.LocalDate;
import java.util.*;

public class Entreprise{
    private double bonusTotal;
    private Collection<Employe> lePersonnel;

    public Entreprise(){
        this.lePersonnel= new ArrayList<>();
        this.bonusTotal =0;
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
        TreeSet<Employe> ordonne = new TreeSet<>(lePersonnel);
        return ordonne;
    }

    public Collection<Employe> getEmployesDansDesordre() {
        HashSet desordre = new HashSet<>(lePersonnel);
        return desordre;
    }

    public double getBonusTotal() {
        return bonusTotal;
    }

    public void setBonusTotal(double bonusTotal) {
        this.bonusTotal = bonusTotal;
    }

    public void distribuerBonus() {
        Queue<Employe> ordreDesVieux = new PriorityQueue<>(new OrdreAnciennete());
        ordreDesVieux.addAll(lePersonnel);
        for (Employe lePlusVieux: ordreDesVieux){
            if(bonusTotal >= lePlusVieux.getMoisAnciennete()*3){
                lePlusVieux.setBonus(lePlusVieux.getMoisAnciennete()*3);
                bonusTotal-=lePlusVieux.getMoisAnciennete()*3;
            }
            else {
                lePlusVieux.setBonus(bonusTotal);
                bonusTotal=0;
            }
        }


    }

    public void remercier(int n) {
        int compteur = 0;
        Queue<Employe> lesJeuns = new PriorityQueue<>(new OrdreRecent().reversed());
        lesJeuns.addAll(lePersonnel);
        while(compteur!=n && !lesJeuns.isEmpty()){
            Employe licencier = lesJeuns.poll();
            lePersonnel.removeIf(e -> {return licencier.getDateEmbauche().equals(e.getDateEmbauche()) && licencier.equals(e);});
            compteur++;
        }
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
