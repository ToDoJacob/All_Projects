package listTest;

import java.util.ArrayList;

public class ListApp {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		//추가
		list.add("사과");
		list.add("포도");
		list.add(0, "바나나");
		System.out.println(list);
		
		//단건 조회
		System.out.println("1번" + list.get(1));
		
		//전체 조회
		for(int i=0; i<list.size(); i++ ) {
			System.out.println(String.format("%d번 %s", i, list.get(i)));
		}
		//향상된 for문 전체조회
		for(String temp : list) {
			System.out.println(temp);
		}
		
		//조회
		int idx = list.indexOf("포도");
		System.out.println(idx==-1? "no" : idx + "번째"); 		//없으면  no라고하고 있으면 자리가나옴 
		
		//변경
		list.set(0, "메론");	//0번째자리에 ,뒤에 인수로 교체
		System.out.println(list);
		
		//정렬
		
		//삭제
		list.remove(0);
		System.out.println(list);
		
		//모두삭제
		list.clear();
		System.out.println(list);
		
	}

}
