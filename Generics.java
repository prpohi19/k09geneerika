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
Saab, praegune hind: 1040 EUR. Ennustatav hind järgnevatel viiel aastal:
 1. aasta: 728 EUR, 2. aasta: 509 EUR, 3. aasta: 356 EUR, 4. aasta: 249 EUR, 5. aasta: 174 EUR

BMW, praegune hind: 950 EUR. Ennustatav hind järgnevatel viiel aastal:
 1. aasta: 1045 EUR, 2. aasta: 1149 EUR, 3. aasta: 1263 EUR, 4. aasta: 1389 EUR, 5. aasta: 1527 EUR

Ford, praegune hind: 600 EUR. Ennustatav hind järgnevatel viiel aastal:
 1. aasta: 720 EUR, 2. aasta: 864 EUR, 3. aasta: 1036 EUR, 4. aasta: 1243 EUR, 5. aasta: 1491 EUR
*/
