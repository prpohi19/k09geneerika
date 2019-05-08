public class Geneerika {
  //leiab maksimumi:
   public static <M extends Comparable<M>> M maximum(M x, M y, M z) {
      M max = x;
      if(y.compareTo(max) > 0) {max = y; }
      if(z.compareTo(max) > 0) {max = z;}
      return max;
   }

   // geneerikaga massiivi printimine
   public static < E > void printArray( E[] inputArray ) {
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }

   public static void main(String args[]) {
      System.out.printf("\nmaximum leiab antud andmetüübi maksimumi:\n\n");
      System.out.printf("%d, %d,  %d - maksimum decimal integer on: %d\n\n",
        67, -4, 198, maximum( 67, -4, 198 ));

      System.out.printf("%.1f,%.1f %.1f - maksimum float on %.1f\n\n",
         0.890, 76.0, 6.4, maximum( 0.890, 76.0, 6.4 ));

      System.out.printf("%s, %s, %s - maksimum string on %s\n\n",
      "adbc","abdc", "tark", maximum("adbc", "abdc", "tark"));


      System.out.println("printArray prindib erineva andmetüübi massiive:");

      Integer[] intArray = { 5, 4, 3, 2, 1 };
      Double[] doubleArray = { 1.0, 2.1, 3.2, 4.3, 5.4 };
      Character[] charArray = { 'C', 'h', 'A', 'r', 'A', 'c', 'T', 'e', 'r'};

      System.out.println("\nIntegerArray koosneb:");
      printArray(intArray);

      System.out.println("\nDoubleArray koosneb:");
      printArray(doubleArray);   // pass a Double array

      System.out.println("\nCharacterArray koosneb:");
      printArray(charArray);   // pass a Character array
   }
}
