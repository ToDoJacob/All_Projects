package co.yedam.common;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

/*
 * 학새으이 값을 입력받아서 학생의 점수를 반환해주는 기능.
*/
public class ToIntFunctionExample {

	public static void main(String[] args) {
		ToIntFunction<Student> tif = (student) -> {
			return student.score;
		};
		Student s1 = new Student();
		s1.name = "Hong";
		s1.score = 90;
		
		int score = tif.applyAsInt(s1);//s1을 매개값으로 받아서 student.score(int)로 내보내서 score변수에 담아준다.
		System.out.println(score);
		
		//학생의 점수합계 구하도록.
		Student s2 = new Student();
		s2.name = "박민수";
		s2.score = 80;
		
		Student s3 = new Student();
		s3.name = "김은정";
		s3.score = 90;
		
		List<Student> list = Arrays.asList(s1,s2,s3);
		ToIntFunction<Student> fi = value-> value.score;
		
		scoreSum(list, fi);
	}
	
	static void scoreSum(List<Student> list, ToIntFunction<Student> fi) {
		int sum = 0;
		
		for(Student student : list) {
			sum += fi.applyAsInt(student);
		}
		System.out.println("학생점수합계: "+ sum);
	}
	
	static int sum(int a , int b) {
		return a+b;
	}
}
