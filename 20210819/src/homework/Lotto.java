package homework;

import java.util.HashSet;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		
		//중복값이 없는 숫자 6개를 생성
		int cnt = 6;
		
//		List<Integer> list = new ArrayList<>();			//set으로 바꿔야 중복값제거된다.
		Set<Integer> list = new HashSet<>();
		
		while(list.size()<6) {
			//난수
			int r = (int)(Math.random()*10)+1;	//난수 1~10
			list.add(r);			
			
		}
		System.out.println(list);	//iterator을 이용해서 전체 출력
	}

}
