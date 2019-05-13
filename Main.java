public class Main {

    public static void main(String[] args) {
        Arvutamine<String, Integer> arvutamine = new Arvutamine<>("dasdsadsa", 2312312);
        Arvutamine arvutamine2 = new Arvutamine<>(312.3, 2312312);
        Arvutamine<Integer, Integer> arvutamine1 = new Arvutamine<>(31231312, 2312312);

        arvutamine.printobject();
        System.out.println(arvutamine1.obj1 + arvutamine1.obj2);;
    }

}
