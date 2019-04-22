/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println("List size: " + list.getSize());
        list.add("Hello");
        list.add("world");
        list.add("!");
        System.out.println("List size: " + list.getSize());
        System.out.println("Second item: " + list.get(1));
        System.out.println("Replacing it...");
        list.replace(1, "replaced text");
        System.out.println("Second item: " + list.get(1));

        
        System.out.println("\n=======================");
        System.out.println("Integers list: ");
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(5);
        list2.add(8);
        list2.add(1);
        list2.add(3);
        list2.add(80);
        list2.add(10);
        System.out.println("Size: " + list2.getSize() + " | First item: " + list2.get(0));
        System.out.println("Removing first item...");
        list2.remove(0);
        System.out.println("Size: " + list2.getSize() + " | First item: " + list2.get(0));

        System.out.println("Third item: " + list2.get(2));
        System.out.println("Removing Third item...");
        list2.remove(2);
        System.out.println("Size: " + list2.getSize() + " | Third item: " + list2.get(2));

        System.out.println("Removing last item...");
        list2.remove(4);
        System.out.println("Size: " + list2.getSize());

        System.out.println("\nRest of the items: ");
        for (int i = 0; i < list2.getSize(); i++) {
            System.out.println(list2.get(i));
        }


    }
}