import java.util.ArrayList;

public class Geneerika {
    public static void main(String[] args) {

        Info<Integer, String> entry = new Info<>(55511111, "Juku");
        Info<String, String> entry1 = new Info<>("+3725551111", "Juku");
        Info<String, String> entry2 = new Info<>("+51990022", "Maali");
        Info<Integer, String> entry3 = new Info<>(51990022, "Maali");

        Integer phone = entry.getKey();

        String name = entry.getValue();

        System.out.println("Phone = " + phone + " -> name = " + name);

        ArrayList<Info<Integer, String>> list = new ArrayList<>();
        ArrayList<Info<String, String>> list2 = new ArrayList<>();

        list.add(entry);
        list.add(entry3);
        list2.add(entry1);
        list2.add(entry2);

        System.out.println("Phone = " + Info.getElement(list, 1).getKey());
        System.out.println("Name = " + Info.getElement(list, 0).getValue());
        System.out.println("Phone = " + Info.getElement(list2, 1).getKey());
        System.out.println("Name = " + Info.getElement(list2, 0).getValue());
    }
}