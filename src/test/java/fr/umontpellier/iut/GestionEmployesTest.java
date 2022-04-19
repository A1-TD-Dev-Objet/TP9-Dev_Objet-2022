package fr.umontpellier.iut;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class GestionEmployesTest {

    @Disabled
    @Test
    public void test_if_main_method_was_implemented() {
        assertDoesNotThrow(() -> GestionEmployes.main(new String[1]));
    }

    @Test
    public void test_getEmployeDesordre(){
        Entreprise pap1dustrie = new Entreprise();
        Entreprise pasPap1dustrie = new Entreprise();
        Employe stella = new Employe("1","Stella",1);
        Employe raph = new Employe("2","Raph",1);
        Employe etienne = new Employe("3","Etienne",1);
        Employe raphBis = new Employe("2","Raph",1);

        pap1dustrie.embaucher(stella, LocalDate.now());
        pap1dustrie.embaucher(raph,LocalDate.now());
        pap1dustrie.embaucher(etienne,LocalDate.now());
        pap1dustrie.embaucher(raphBis,LocalDate.now());

        pasPap1dustrie.embaucher(stella, LocalDate.now());
        pasPap1dustrie.embaucher(raph,LocalDate.now());
        pasPap1dustrie.embaucher(etienne,LocalDate.now());

        assertTrue(pap1dustrie.getEmployesDansDesordre().containsAll(pasPap1dustrie.getEmployesDansDesordre()));
        assertTrue(pasPap1dustrie.getEmployesDansDesordre().containsAll(pap1dustrie.getEmployesDansDesordre()));
    }

    @Test
    public void test_getEmployeOrdonnes(){
        Entreprise pap1dustrie = new Entreprise();
        Entreprise pasPap1dustrie = new Entreprise();
        Employe stella = new Employe("1","Stella",1);
        Employe raph = new Employe("2","Raph",1);
        Employe etienne = new Employe("3","Etienne",1);
        Employe raphBis = new Employe("2","Raph",1);

        pap1dustrie.embaucher(stella, LocalDate.now());
        pap1dustrie.embaucher(raph,LocalDate.now());
        pap1dustrie.embaucher(etienne,LocalDate.now());
        pap1dustrie.embaucher(raphBis,LocalDate.now());

        pasPap1dustrie.embaucher(stella, LocalDate.now());
        pasPap1dustrie.embaucher(raph,LocalDate.now());
        pasPap1dustrie.embaucher(etienne,LocalDate.now());

        assertTrue(pap1dustrie.getEmployesOrdonnes().containsAll(pasPap1dustrie.getEmployesOrdonnes()));
        assertTrue(pasPap1dustrie.getEmployesOrdonnes().containsAll(pap1dustrie.getEmployesOrdonnes()));
    }


}