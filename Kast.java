public class Kast<E> {
    private E e;

    public void add(E e){
        this.e = e;
    }

    public E get(){
        return e;
    }
}