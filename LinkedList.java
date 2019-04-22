/**
 * LinkedList
 */
public class LinkedList<T> {
    
    private Node<T> head = null;
    private Node<T> tail = null;

    public LinkedList() {

    }

    public void add(T item) {
        if (tail == null) {
            head = new Node<>(item);
            tail = head;
        } else {
            Node oldTail = tail;
            tail = new Node<>(item);
            oldTail.setNext(tail);
        }
    }

    public T get(int index) {
        return getNode(index).getData();
    }

    public void remove(int index) {
        // If the node is head, simply replace the head with the next node
        if (index == 0) {
            head = head.getNext();
            return;
        }
        // Get the node that is before the one that's going to be removed
        Node temp = getNode(index - 1);
        // Check if the node we plan to remove exists
        if (temp.getNext() == null) {
            throw new ArrayIndexOutOfBoundsException("Expected index from 0 to " + (getSize() - 1) + ". Got " + index);
        }
        // If the node we want to remove is the tail, simply replace the tail with temp and set temp's next to null
        if (temp.getNext() == tail) {
            tail = temp;
            temp.setNext(null);
        } else { 
            // If the node we want to remove is in the middle of the list, set temp's next to the Node that is after the Node we want to remove
            temp.setNext(temp.getNext().getNext());
        }
    }

    public void replace(int index, T item) {
        getNode(index).setData(item);
    }

    public int getSize() {
        if (head == null) {
            return 0;
        } else {
            Node<T> next = head;
            int i = 0;
            while (next != null) {
                i++;
                next = next.getNext();
            }
            return i;
        }
    }

    private Node<T> getNode(int index) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index must be bigger or equal to 0");
        } else if (head == null) {
            throw new ArrayIndexOutOfBoundsException("No elements in array");
        }
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
            if (temp == null) {
                throw new ArrayIndexOutOfBoundsException("Expected index from 0 to " + (getSize() - 1) + ". Got " + index);
            }
        }
        return temp;
    }

}