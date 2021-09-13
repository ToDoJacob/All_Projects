package co.yedam.excel;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
enum Gender {
	MALE, FEMALE;
}

class Student {
	String name;
	Gender gen;
	int mScore;
	int eScore;

	Student(String n, Gender g, int m, int e) {
		name = n;
		gen = g;
		mScore = m;
		eScore = e;
	}
}// end of Student

public class StudentMappingExample3 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(//
				new Student("박지민", Gender.FEMALE, 85, 89)
				,new Student("홍민우", Gender.MALE, 70, 65)
				,new Student("김수지", Gender.FEMALE, 90, 92)
				, new Student("최민수", Gender.MALE, 80, 85)
		);
		// 여학생 -> 수학점수평균 ..
		int sum = 0, rcnt = 0;
		for(int i=0 , cnt=list.size(); i<cnt; i++) {
			if(list.get(i).gen == Gender.FEMALE) {
				sum += list.get(i).mScore;
				rcnt++;
			}
		}
		double avg = sum / rcnt;
		
		// strem으로 활용
		//studentStream의 각각의 행에대해 ()안의 기능을 적용해주겠다.
		Stream<Student> studentStream = list.stream(); //컬렉션에 stream이라는 함수가 정해져있다. (내부반복자)
		studentStream.forEach(new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				String name = t.name;
				int math = t.mScore;
				int english = t.eScore;
				System.out.printf("이름: %s, 영어: %d, 수학: %d\n", name, english, math);
			}
			
		}); // 전체학생 이름, 영어, 수학 출력.
		
		studentStream = list.stream();
		OptionalDouble avg1 = studentStream.filter(new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				return t.gen == Gender.FEMALE && t.mScore > 95;
			} //여학생들만 담고있는 새로운 스트림상태 ===>다음스트림으로 그중에서 수학점수만 뽑아내자
			
		}).mapToInt(new ToIntFunction<Student>() {	// int(IntStream) vs Integer(Stream<Integer>)

			@Override
			public int applyAsInt(Student t) {
				return t.mScore;
			}
			
		}).average();	
		
		if(avg1.isPresent()) {
			System.out.println(avg1.getAsDouble());
		} else {
			System.out.println("해당요소가 없습니다.");
		}
		
	} // end of main()

}
