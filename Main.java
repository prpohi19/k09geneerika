public class Main {

    public static class Arvud <T, U> {
        T obj1;
        U obj2;
    
        public Arvud(T obj1, U obj2) {
            this.obj1 = obj1;
            this.obj2 = obj2;
        }
        public void print(){
            System.out.println("Esimene objekt on " + obj1);
            System.out.println("Teine objekt on " + obj2);
        }
    
    }

    public static void main(String[] args) {
        Arvud geneerika = new Arvud("qwerty", 123456789);
        geneerika.print();
    }
}
