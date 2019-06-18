import java.util.*;

public class Generics{
    public static void arvutaHind(int hind, double koef, int aasta){
        for(int i = 0; i < aasta; i++){
            hind *= koef;
            System.out.print(" " + (i+1) + ". aasta: " + hind + " EUR");
            if(i != aasta - 1){
                System.out.print(",");
            }
        }
        System.out.println("\n");
    }
    public static void main(String[] args){
        int i = 0;
        List<Hinnad<String, Integer, Double>> hinnad = new ArrayList<Hinnad<String, Integer, Double>>();
        hinnad.add(new Hinnad<String, Integer, Double>("Saab", 1040, 0.7));
        hinnad.add(new Hinnad<String, Integer, Double>("BMW", 950, 1.1));
        hinnad.add(new Hinnad<String, Integer, Double>("Ford", 600, 1.2));
        for (Hinnad e: hinnad) {
            System.out.println(hinnad.get(i).mark + ", praegune hind: " + hinnad.get(i).hetkehind + " EUR. Ennustatav hind järgnevatel viiel aastal:");
            arvutaHind(hinnad.get(i).hetkehind, hinnad.get(i).hinnaTousuKoef, 5);
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
