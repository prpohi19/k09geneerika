public class Arvutamine<T, U> {

    T obj1;
    U obj2;

    public Arvutamine(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void printobject(){
        System.out.print(obj1);
        System.out.println();
        System.out.println(obj2);
    }

}
