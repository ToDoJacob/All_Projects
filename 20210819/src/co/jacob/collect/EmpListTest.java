package co.jacob.collect;

import java.util.ArrayList;

import co.jacob.exception.Emp;

public class EmpListTest {

	public static void main(String[] args) {

		ArrayList<Emp> list = new ArrayList<>();

		// 추가 3건
		list.add(new Emp(100, "홍길동", "인사"));
		list.add(new Emp(101, "김기자", "인사"));
		list.add(new Emp(102, "이순신", "인사"));
		
		// 삭제
//		list.remove(0);
		list.remove(new Emp(101, "김기자","인사"));
		
		// 이름만 모두 출력
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		
		Emp e1= new Emp(100, "홍길동", "인사");
		Emp e2= new Emp(100, "홍길동", "인사");
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
	}
	

	
}
