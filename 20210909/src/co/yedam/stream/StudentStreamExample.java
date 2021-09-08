package co.yedam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
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
}

public class StudentStreamExample {
	public static void main(String[] args) {
		// 학생(이름 , 성별 , 영어 , 수학) -> 여학생 -> 영어점수:80이상 -> 명단출력
		List<Student> list = Arrays.asList(//
				new Student("박지민", Gender.FEMALE, 85, 89)
				,new Student("홍민우", Gender.MALE, 70, 65)
				,new Student("김수지", Gender.FEMALE, 90, 92)
				, new Student("최민수", Gender.MALE, 80, 85)
		);
		Stream<Student> stream = list.stream();
		Stream<Student> femaleStudent =
				stream.filter(( t) -> {
				return t.gen == Gender.FEMALE && t.eScore >= 80;
				});
		femaleStudent.forEach(( t) -> {
				System.out.printf("이름: %s, 영어: %d, 수학: %d\n",t.name,t.eScore,t.mScore);
				});
	}
}
