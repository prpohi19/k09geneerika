import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bucket <String, Integer> SandBucket1= new Bucket<String, Integer>("Liiv", 6);
        Bucket <String, Integer> SandBucket2= new Bucket<String, Integer>("Liiv", 10);
        Bucket <String, Integer> WaterBucket1= new Bucket<String, Integer>("Vesi", 2);

        List<Bucket<String,Integer>> Buckets= new ArrayList<Bucket<String,Integer>>();

        Buckets.add(SandBucket1);
        Buckets.add(SandBucket2);
        Buckets.add(WaterBucket1);

        int i = 0;
        for(Bucket e: Buckets){
            System.out.println("Ämbri sisu on: "  + Buckets.get(i).getContent() + ", " + Buckets.get(i).getVolume() + " liitrit ");
            i++;
        }
    }
}
