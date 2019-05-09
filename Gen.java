public class Gen<S> {
   private S s;

   public void add(S s) {
      this.s = s;
   }

   public S get() {
      return s;
   }

   public static void main(String[] args) {
      Gen<Double> jamesBond = new Gen<Double>();
      Gen<String> jamesHarden = new Gen<String>();

      jamesBond.add(0.07);
      jamesHarden.add(new String("JAAAAAAAAAMEES       haaaaaaaarRDDEEEENnn"));

      System.out.println("Double Value : "+ jamesBond.get());
      System.out.println("String Value : "+ jamesHarden.get());
   }
}
