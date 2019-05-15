public class geneerika<S> {
   private S s;

   public void add(S s) {
      this.s = s;
   }

   public S get() {
      return s;
   }

   public static void main(String[] args) {
      geneerika<Integer> daysInYear = new geneerika<Integer>();
      geneerika<String> fraternity = new geneerika<String>();
      daysInYear.add(365);
      fraternity.add(new String("Vironia"));
      System.out.println("Päevi aastas: "+ daysInYear.get());
      System.out.println("Minu korporatsioon on: "+ fraternity.get());
   }
}
