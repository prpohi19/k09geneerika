import java.util.ArrayList;

public class Info<K, V> {
    private K key;
    private V value;

    public Info(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    
    public static <E> E getElement(ArrayList<E> list, int n) {
        if (list == null || list.isEmpty() || n >= list.size()) {
            return null;
        }
        E element = list.get(n);
        return element;
    }
}