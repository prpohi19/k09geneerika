import java.util.*;

public class Geneerika{
    public static void arvutaPalk(int palk, double koef, int aasta){
        for(int i = 0; i < aasta; i++){
            palk *= koef;
            System.out.print(" " + (i+1) + ". aasta: " + palk + " EUR");
            if(i != aasta - 1){
                System.out.print(",");
            }
        }
        System.out.println("\n");
    }
    public static void main(String[] args){
        int i = 0;
        List<Palgad<String, Integer, Double>> palgad = new ArrayList<Palgad<String, Integer, Double>>();
        palgad.add(new Palgad<String, Integer, Double>("Kati Kadakas", 1040, 1.2));
        palgad.add(new Palgad<String, Integer, Double>("Mati Mõdu", 950, 1.3));
        palgad.add(new Palgad<String, Integer, Double>("Maali Maasikas", 1100, 1.1));
        for (Palgad e: palgad) {
            System.out.println(palgad.get(i).tootaja + ", praegune palk: " + palgad.get(i).hetkePalk + " EUR. Ennustatav kuupalk järgnevatel viiel aastal:");
            arvutaPalk(palgad.get(i).hetkePalk, palgad.get(i).palgatousuKoef, 5);
            i++;
        }
    }
}

/*
Väljund:

Kati Kadakas, praegune palk: 1040 EUR. Ennustatav kuupalk järgnevatel viiel aastal:
 1.aasta: 1248 EUR, 2.aasta: 1497 EUR, 3.aasta: 1796 EUR, 4.aasta: 2155 EUR, 5.aasta: 2586 EUR

Mati Mõdu, praegune palk: 950 EUR. Ennustatav kuupalk järgnevatel viiel aastal:
 1.aasta: 1235 EUR, 2.aasta: 1605 EUR, 3.aasta: 2086 EUR, 4.aasta: 2711 EUR, 5.aasta: 3524 EUR

Maali Maasikas, praegune palk: 1100 EUR. Ennustatav kuupalk järgnevatel viiel aastal:
 1.aasta: 1210 EUR, 2.aasta: 1331 EUR, 3.aasta: 1464 EUR, 4.aasta: 1610 EUR, 5.aasta: 1771 EUR

*/