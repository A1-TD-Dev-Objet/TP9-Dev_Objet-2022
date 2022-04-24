package fr.umontpellier.iut;

import java.util.HashMap;
import java.util.Map;

public class GestionDistances {
    private static Map<String, Integer> distances;
    static {
        distances=new HashMap<String,Integer>();
        distances.put("Montpellier",0);
        distances.put("Sète",36);
        distances.put("Sommières",30);
        distances.put("Nîmes",58);
        distances.put("Lunel",30);
        distances.put("Béziers",80);
    }




    public static int getDistance(String ville) throws AdresseInconnueException {
        if (distances.get(ville)==null){
            throw new AdresseInconnueException(ville);
        }
        else{
            return distances.get(ville);
        }
    }
}
