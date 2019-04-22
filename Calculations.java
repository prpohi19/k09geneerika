import java.util.ArrayList;
import java.util.List;

public class Calculations {
   
   
   public static <T extends Comparable<T>> T max(T x, T y, T z) {
      T maximum = x;   
      if(y.compareTo(maximum) > 0) {
         maximum = y;   
      }
      if(z.compareTo(maximum) > 0) {
         maximum = z;                   
      }
      return maximum;    
   }
   
   public static <E extends Comparable<E>> E min(E[] list) {
     E minimum = list[0];
     for(int i = 1; i < list.length; i++) {
         if( minimum.compareTo(list[i]) > 0) { 
             minimum = list[i];
         }
     }
     return minimum; 
   }
	
   public static double sum(List<? extends Number> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
	
   public static void main(String args[]) {
        System.out.printf("Maximum of %d, %d and %d is %d\n", 3, 4, 5, max( 3, 4, 5 ));
		
		Integer[] numbers = { new Integer(1), new Integer(2), new Integer(3), new Integer(4)};
        System.out.printf("Minumum of %d, %d, %d and %d is %d\n", numbers[0],  numbers[1],  numbers[2], numbers[3], min(numbers));
		
		List<Integer> ints = new ArrayList<>();
		ints.add(3); ints.add(5); ints.add(10);
		double sum = sum(ints);
		int answer = (int)sum;
		System.out.println("Sum of ints is " + answer);

      
   }
}