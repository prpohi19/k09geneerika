
public class Main1 {

    public static void main(String[] args) {

        jalaNumber<Double, String> list = new jalaNumber<>(38.0, "Taavi");
        jalaNumber<Double, String> list2 = new jalaNumber<>(46.5, "Martin");
        jalaNumber<Double, String> list3 = new jalaNumber<>(36.5, "Kristiina");
        jalaNumber<Double, String> list4 = new jalaNumber<>(44.0, "Markus");

        System.out.println(list.getNimi() + ", sinu jalanumbriks on " + list.getJalg());
        System.out.println(list2.getNimi() + ", sinu jalanumbriks on " + list2.getJalg());
        System.out.println(list3.getNimi() + ", sinu jalanumbriks on " + list3.getJalg());
        System.out.println(list4.getNimi() + ", sinu jalanumbriks on " + list4.getJalg());

/*Taavi, sinu jalanumbriks on 38.0
Martin, sinu jalanumbriks on 46.5
Kristiina, sinu jalanumbriks on 36.5
Markus, sinu jalanumbriks on 44.0*/

    }

}
