package co.jacob.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		//학생 이름과 성적을 Map에 저장
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 100);
		map.put("김기자", 50);
		map.put("이순신", 80);
		
		//성적조회
		
		System.out.println(map.get("홍길동"));
		
		
		//전체조회
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println(value);
			
		}
	}

}
