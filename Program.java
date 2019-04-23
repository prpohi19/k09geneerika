import java.util.ArrayList;
import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
      Container<Integer, String> IntStr = new Container<Integer, String>();
      Container<String, String> StrStr = new Container<String, String>();
      Container<Integer, Integer> IntInt = new Container<Integer, Integer>();
      Container<String, Integer> StrInt = new Container<String, Integer>();
      Scanner reader = new Scanner(System.in);

      int aInt = 0;
      int bInt = 0;
      String aStr = "";
      String bStr = "";

      System.out.println("Insert first value");
      System.out.println("Integer 1 / String 2: ");
      int set = Integer.parseInt(reader.nextLine());

      if(set == 1){
        System.out.println("Sisesta number: ");
        aInt = Integer.parseInt(reader.nextLine());
      }else if(set == 2){
        System.out.println("Sisesta sona: ");
        aStr = reader.nextLine();
      }else{
        System.out.println("Wrong format");
      }

      System.out.println("Insert second value");
      System.out.println("Integer 1 / String 2: ");
      int set2 = Integer.parseInt(reader.nextLine());

      if(set2 == 1){
        System.out.println("Sisesta number: ");
        bInt = Integer.parseInt(reader.nextLine());
      }else if(set2 == 2){
        System.out.println("Sisesta sona: ");
        bStr = reader.nextLine();
      }else{
        System.out.println("Wrong format");
      }

      IntInt.add(Integer.valueOf(aInt),Integer.valueOf(bInt));
      if(IntInt.getFirst() * IntInt.getSecond() != 0){
        System.out.println("The value of 2 numbers multiplied is: " + IntInt.getFirst() * IntInt.getSecond());
      }

      StrStr.add(aStr, bStr);
      if(StrStr.getFirst().length() * StrStr.getSecond().length() != 0){
        System.out.println("The value of 2 words multiplied is: " + StrStr.getFirst().length() * StrStr.getSecond().length());
      }

      IntStr.add(aInt,bStr);
      if(IntStr.getFirst() * IntStr.getSecond().length() != 0){
        System.out.println("The value of a number and a word multiplied is: " + IntStr.getFirst() * IntStr.getSecond().length());
      }

      StrInt.add(aStr,bInt);
      if(StrInt.getFirst().length() * StrInt.getSecond() != 0){
        System.out.println("The value of a number and a word multiplied is: " + StrInt.getFirst().length() * StrInt.getSecond());
      }





      /*box1.add("Message","Hello World");
      System.out.printf("String Value :%s\n", box1.getFirst());
      System.out.printf("String Value :%s\n", box1.getSecond());*/
   }
}
