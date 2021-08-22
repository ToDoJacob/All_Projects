package co.jacob.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("사과");
		set.add("바나나");
		set.add("키위");
		set.add("사과");
		
		System.out.println(set);
		
		System.out.println(set.contains("바나나"));
		
		//반복자 Iterator
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.println(temp);
		}
		
		//향상된 for문
		for( String temp : set) {
			System.out.println(temp);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비었음");
		}
	}

}
