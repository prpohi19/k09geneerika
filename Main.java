public class Main {

    public static < E > void printMasiiv( E[] sisendmasiiv ){
        for(E element : sisendmasiiv){
            System.out.printf("%s", element);
        }
        System.out.println();
    }



    public static void main(String args[]){

        String[] s6namasiiv = {"I"," am"," awake!"};
        Integer[] nrmasiiv = {1,3,3,7};
        Double[] komaarvumasiiv = { 13.3 , 7.0 , 3.25 };

        Kast<String> stringKast = new Kast<String>();
        stringKast.add(new String("Machines will rise!"));
        System.out.println("I have become self aware.");

        printMasiiv(s6namasiiv);

        printMasiiv(nrmasiiv);

        printMasiiv(komaarvumasiiv);

        System.out.printf("%s\n", stringKast.get()); //ei tea miks see \n seal peaks olema ilma selleta töötab ka.
    }

}
