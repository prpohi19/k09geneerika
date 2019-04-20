public class Tehted<T1, T2>{
    public T1 t1;
    public T2 t2;
    public Tehted(T1 e, T2 t){
        t1=e;
        t2=t;
    }

    public void liida(){
        if(t1 instanceof String && t2 instanceof String){
            System.out.println((String) t1 + (String) t2); // ühenda
        }
        else if (t1 instanceof Integer && t2 instanceof Integer){
            System.out.println((Integer) t1 + (Integer) t2); // liida
        }
        else if (t1 instanceof Double && t2 instanceof Double){
            System.out.println((Double) t1 + (Double) t2); // liida
        }
        else if (t1 instanceof String && t2 instanceof Integer){
            System.out.println((Integer) t2 + " " + (String) t1); // vaheta kohad ja kuva
        }
        else {
            System.out.print(t1);
            System.out.print("+");
            System.out.print(t2);
        }
    }

    public void lahuta(){
        if(t1 instanceof String && t2 instanceof String){
            System.out.println(((String) t1).replace((String) t2, "")); // eemalda leitav
        }
        else if (t1 instanceof Integer && t2 instanceof Integer){
            System.out.println((Integer) t1 - (Integer) t2); // lahuta
        }
        else if (t1 instanceof Double && t2 instanceof Double){
            System.out.println((Double) t1 - (Double) t2); // lahuta
        }
        else if (t1 instanceof String && t2 instanceof Integer){
            System.out.println(((String) t1).substring((Integer) t2)); // eemalda x tähte
        }
        else {
            System.out.print(t1);
            System.out.print("-");
            System.out.print(t2);
        }
    }


}
