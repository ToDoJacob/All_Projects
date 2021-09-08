package co.yedam.common;

import java.util.function.Predicate;

public class PredicateExample {
//	public static void main(String[] args) {
//		Predicate<Student> predic =  new Predicate<Student>() {
//
//			@Override
//			public boolean test(Student t) {
//				return t.score > 60;
//			}
//			
//		};
		public static void main(String[] args) {
			Predicate<Student> predic = t -> t.score > 60;
			};
		
		
		Student s1 = new Student();
		s1.name = "Hong";
		s1.score = 65;
		
		if(predic.test(s1)) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}
	}
}
