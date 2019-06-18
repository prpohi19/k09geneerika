import java.util.ArrayList;

public class Main {
	public static <T> void printArr(ArrayList<ListItem> arr){
		for(ListItem item:arr){ System.out.println(item.item); }
	}

	public static <T> void main(String[] arg){
		CustomList Soiduk = new CustomList();
		Soiduk.addTo(new Car("123abc", "Saab", "9-5"));
		Soiduk.addTo(new Car("abc123", "Ford", "Sierra"));
		Soiduk.addTo(new Car("12ab", "Suzuki", "GSX"));

		printArr(Soiduk.get());
	}
}
