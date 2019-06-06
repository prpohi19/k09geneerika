public class Generic<S> {
   private S s;

   public void add(S s) {
      this.s = s;
   }

   public S get() {
      return s;
   }

   public static void main(String[] args) {
      Generic<Integer> howOld = new Generic<Integer>();
      Generic<String> favoritePlace = new Generic<String>();
      Generic<Double> citizens = new Generic<Double>();
      howOld.add(27);
      favoritePlace.add(new String("Rome"));
      citizens.add(1.3);
      System.out.println("My age is "+ howOld.get() + " years.");
      System.out.println("My favorite place to travel is "+ favoritePlace.get() + ".");
      System.out.println("Estonian population is about "+ citizens.get() + " million.");
   }
}
