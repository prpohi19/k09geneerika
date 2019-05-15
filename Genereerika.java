public class Genereerika<T> {
   private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }

   public static void main(String[] args) {
      Genereerika<Double> NumberObjekt = new Genereerika<Double>();
      Genereerika<String> StringObjekt = new Genereerika<String>();

      NumberObjekt.add(18.7);
      StringObjekt.add(new String("Tekst ja 123"));

      System.out.println("Numbri väärtus : "+ NumberObjekt.get());
      System.out.println("Stringi väärtus : "+ StringObjekt.get());
   }
}
