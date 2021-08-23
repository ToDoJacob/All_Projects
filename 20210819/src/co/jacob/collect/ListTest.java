package co.jacob.collect;

import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		 
//		List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		
		list.add("사과");
		list.add("배");
		list.remove(0);
		list.set(0, "키위");
		list.get(0);
		((LinkedList<String>)list).addFirst("바나나");
		
	}

}
