public class Geneerika {
   public static < E > void printArray( E[] inputArray ) {

      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }

   public static void main(String args[]) {
      Integer[] intArray = { 5, 6, 3, 4, 1 };
      Double[] doubleArray = { 1.1, 2.6, 3.9, 4.4 };
      Character[] charArray = { 'T', 'E', 'R', 'V', 'I', 'S', 'T' };

      System.out.println("Array integerArray contains:");
      printArray(intArray);

      System.out.println("\nArray doubleArray contains:");
      printArray(doubleArray);

      System.out.println("\nArray characterArray contains:");
      printArray(charArray);
   }
}
