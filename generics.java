import java.util.*;

public class generics {
    public static < E > void printArray( E[] inputArray ) {
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        thisAndThat<Integer, String> list = new thisAndThat<>(1, "burger");
        System.out.println(list.getFood() + " maksab "+ list.getPrice() + " euri.");

        moreStuff<Integer, Double, String> listStuff = new moreStuff<>(22, 4.0, "java");
        System.out.println(listStuff.getArv() + " on int,  "+ listStuff.getKoma() + " on double, " + listStuff.getSõna() + "on sting.");
    }
}