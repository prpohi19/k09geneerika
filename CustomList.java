import java.util.*;
import java.util.ArrayList;

public class CustomList<T> {

    private ArrayList<ListItem> list = new ArrayList<ListItem>();

	public void addTo(T item){
		list.add(new ListItem(item));
	}
	public ArrayList<ListItem> get(){
		return list;
	}
}
