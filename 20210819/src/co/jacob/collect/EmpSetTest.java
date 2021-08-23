package co.jacob.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import co.jacob.exception.Emp;

public class EmpSetTest {

	public static void main(String[] args) {
		
		Set<Emp> set = new HashSet<>();
		
		
		set.add(new Emp(100, "홍길동", "인사"));
		set.add(new Emp(101, "김기자", "인사"));
		set.add(new Emp(102, "이순신", "인사"));
		set.add(new Emp(100, "홍길동", "인사"));
		
		//이름만 출력 Iterator or 향상된 for
		Iterator<Emp> iter = set.iterator();
		while(iter.hasNext()) {
			Emp temp = iter.next();
			System.out.println(temp);
		}
		
		for( Emp temp : set) {
			System.out.println(temp.getName());
		}
		
	}

}
