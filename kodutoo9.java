
public class kodutoo9 {
    public static void main(String[] args){

        auto <String, Integer> Ford= new auto<String, Integer>("Mustang", 12);
        auto <String, String> Tesla= new auto<String, String>("Model S", "70 KWh");
        System.out.println(Ford.getMark());
        System.out.println(Ford.getFuel());
        System.out.println(Tesla.getMark());
        System.out.println(Tesla.getFuel());

    }
}