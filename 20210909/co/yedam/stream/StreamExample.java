package co.yedam.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Hello", "Nice", "Good");
		Iterator<String> iter = list.iterator(); //요소를 하나씩 가지고올 반복자
		while(iter.hasNext()) {
			String result = iter.next();
			System.out.println(result);
		}
		System.out.println("=========");
		Stream<String> stream = list.stream();
		long cnt = stream
		.filter((String t) -> {
			return t.length() == 4;			
			})
//			.forEach((t) -> System.out.println(t));
			.count();
		System.out.println("최종처리요소의 갯수: " + cnt);
//		for (int i = 0; i < list.size(); i++) {
//			list.get(i);
//		}
	}
}
