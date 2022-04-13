package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.Month;

public class GestionEmployes {

    public static void main(String[] args) {
        Employe employe1 = new Employe("uncode","test1",10);
        Employe employe2 = new Employe("uncode","test2",100);
        Employe employe3 = new Employe("uncode","test3",101);
        Employe employe4 = new Employe("uncode","test1",10);


        Entreprise entreprise = new Entreprise();
        entreprise.embaucher(employe1,LocalDate.now());
        entreprise.embaucher(employe2,LocalDate.of(2000,Month.APRIL,01));
        entreprise.embaucher(employe3,LocalDate.of(2003,Month.JANUARY,04));
        entreprise.embaucher(employe4,LocalDate.now());


        System.out.println(entreprise.toString());
    }

}
