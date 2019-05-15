import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class main{
    public static <E> void printArray(E[] inputArray){
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sisesta midagi: ");
        String input = scan.nextLine();
        char[] characters = input.toCharArray();
        
        int len = characters.length;
        Character[] charArr = new Character[len];
        for (int i = 0; i < len; i++){
            charArr[i] = characters[i];
        }
        
        printArray(charArr);

        ArrayList<Integer> list = new ArrayList<>();
        for (char c: charArr){
            System.out.print("Sisesta arv: ");
            int num = Integer.parseInt(scan.nextLine());
            list.add(num);
        }

        Collections.sort(list);
        for(int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            System.out.println(current);
        }
    }
}