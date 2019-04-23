import java.util.ArrayList;

public class Main {
	
	public static <T> void printArr(ArrayList<ListItem> arr){
		for(ListItem item:arr){ System.out.println(item.item); }
	}
	
	public static <T> void main(String[] arg){
		CustomList vehicles = new CustomList();
		vehicles.addTo(new Car("674-BCL", "Mitsubishi", "Colt"));
		vehicles.addTo(new Car("E=MC^2", "Delorian", "MartyMcFly"));
		vehicles.addTo(new Motorboat("BB1-53B", "Monte Carlo", "6S"));
		
		printArr(vehicles.get());
	}
}

/*
[cauphel@greeny k09geneerika]$ java Main
Reg. märk: 674-BCL Mark: Mitsubishi Mudel: Colt
Reg. märk: E=MC^2 Mark: Delorian Mudel: MartyMcFly
Reg. märk: BB1-53B Mark: Monte Carlo Mudel: 6S

*/