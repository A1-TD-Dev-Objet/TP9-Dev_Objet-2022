package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.Month;

public class GestionEmployes {

    public static void main(String[] args) {
        Employe employe1 = new Employe("01","test1",10);
        Employe employe2 = new Employe("02","test2",100);
        Employe employe3 = new Employe("03","test3",101);
        Employe employe4 = new Employe("01","test1",10);
        Employe employe5 = new Employe("05","test5",10);
        Employe employe6 = new Employe("04","test5",100);
        Employe employe7 = new Employe("07","test7",101);
        Employe employe8 = new Employe("07","test6",10);


        Entreprise entreprise = new Entreprise();
        entreprise.embaucher(employe1,LocalDate.now());
        entreprise.embaucher(employe2,LocalDate.of(2000,Month.APRIL,01));
        entreprise.embaucher(employe3,LocalDate.of(2003,Month.JANUARY,04));
        entreprise.embaucher(employe4,LocalDate.now());
        entreprise.embaucher(employe5,LocalDate.of(700,Month.JUNE,14));
        entreprise.embaucher(employe6,LocalDate.of(2004,Month.OCTOBER,23));
        entreprise.embaucher(employe7,LocalDate.of(2014,Month.JULY,04));
        entreprise.embaucher(employe8,LocalDate.now());


        System.out.println(entreprise.getEmployesOrdonnes().toString());
    }

}
