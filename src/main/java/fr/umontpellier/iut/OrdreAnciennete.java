package fr.umontpellier.iut;

import java.util.Comparator;

public class OrdreAnciennete implements Comparator<Employe> {

    @Override
    public int compare(Employe o1, Employe o2) {
        return o2.getMoisAnciennete() - (o1.getMoisAnciennete());
    }
}
