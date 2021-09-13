package co.yedam.common;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
class Student {
	String name;
	int score;
}



public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer= (String t) -> {
				System.out.println(t);
			};
		consumer.accept("홍길동");
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.score = 80;
		
		BiConsumer<Student, String> bicon = (student, message) -> {
			System.out.println("학생이름: " + student.name + "\n점수: "+ student.score);
			System.out.println("메세지: " + message);
		};
		bicon.accept(s1, "반갑습니다.");
		//Student, Integer
		BiConsumer<Student, Integer> bin = (student, cnt) -> {
			for(int i=0; i<cnt; i++) {
				System.out.printf("학생이름: %s, 점수: %d \n", student.name, student.score);
			}
		};
		bin.accept(s1, 3);
	}
}
