import java.util.*;
public class Kodus{
    public static < E > void printArray( E[] inputArray ) {
        for(E element : inputArray) {
           System.out.printf("%s ", element);
        }
        System.out.println();
     }

     public static void main(String args[]) {
        List<Integer, String> list = new List<>(5, "Maksim");
        System.out.println(list.getName() + ", Sai hindeks: "+ list.getGrade());

        Character[] t2hed = { 'P', 'E', 'E', 'N', 'I', 'K', 'E', };
        System.out.println("Massiiv t2hed sisaldab:");
        printArray(t2hed);
     }



    }