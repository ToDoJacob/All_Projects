package co.yedam.excel;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentMappingExample2 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(//
				new Student("박지민", Gender.FEMALE, 85, 89)
				,new Student("홍민우", Gender.MALE, 70, 65)
				,new Student("김수지", Gender.FEMALE, 90, 92)
				, new Student("최민수", Gender.MALE, 80, 85)
		);
		//반환되는 데이터의 유형이 달라진다.
		List<Student> l = list.stream().collect(Collectors.toList());
		
		List<String> s = list.stream()
			.map(new Function<Student, String>(){
			@Override
			public String apply(Student t) {
				return null;
			}
		})
		.collect(Collectors.toList());
		
		
	}
}
