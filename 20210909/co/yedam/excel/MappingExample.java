package co.yedam.excel;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MappingExample {

	public static void main(String[] args) {
		
		// 학생(이름 , 성별 , 영어 , 수학) -> 여학생 -> 영어점수:80이상 -> 명단출력
			List<Student> list = Arrays.asList(//
					new Student("박지민", Gender.FEMALE, 85, 89)
					,new Student("홍민우", Gender.MALE, 70, 65)
					,new Student("김수지", Gender.FEMALE, 90, 92)
					, new Student("최민수", Gender.MALE, 80, 85)
			);
//			int sum = list.stream()
//				.filter(s -> s.gen == Gender.MALE)
//				.mapToInt(new ToIntFunction<Student>() {
//					public int applyAsInt(Student s) {
//						return s.eScore;
//					}
//				})
//				.sum();
				
			//.min을 이용하여 최소값 구하기
//			OptionalInt minValue = list.stream()
//					.filter(s -> s.gen == Gender.MALE && s.eScore == 100)
//					.mapToInt(new ToIntFunction<Student>() {
//						public int applyAsInt(Student s) {
//							return s.eScore;
//						}
//					})
//					.min();
//			if(minValue.isPresent()) {
//				System.out.println("최솟값: " + minValue);
//			} else {
//				System.out.println("해당 요소 없습니다.");
//			}
			
			
			//형진이꺼
//			 OptionalDouble summax = list.stream()
//					 .filter(s -> s.gen==Gender.MALE)
//					 .mapToDouble((s)->(s.eng+s.mat)/2)
//					 .max();
////		      String na = list.stream().filter(s -> s.gen==Gender.MALE).mapToDouble((s)->(s.eng+s.mat)/2).max().;
//		      System.out.println(sum);
//		      System.out.println(avg);
//		      System.out.println(min);
//		      System.out.println(summax);
		   

			
			
//			OptionalDouble maxValue = list.stream()
//					.filter(s -> s.gen == Gender.MALE)
//					.mapToDouble(new ToDoubleFunction<Student>() {
//
//						@Override
//						public double applyAsDouble(Student s) {
//							return (s.eScore + s.mScore) / 2.0;
//						}
//						
//					})
//					.max();
//			if(maxValue.isPresent()) {
//				System.out.println("최댓값: " + maxValue);
//			} else {
//				System.out.println("해당 요소 없습니다.");
//			}
			
			
			list.stream()
				.map(new Function<Student, HighStudent>(){
					@Override
					public HighStudent apply(Student t) {
						HighStudent hs = new HighStudent(t.name, 
														t.gen, 
														t.eScore, 
														t.mScore, 
														(t.eScore + t.mScore)/2.0 );
						return hs;
					}
				})
				.filter(new Predicate<HighStudent>() {

					@Override
					public boolean test(HighStudent t) {
						return t.avg >= 80;
					}
					
				})
				.forEach(e -> System.out.printf("이름: %s, 평균: %s\n",e.name, e.avg));
			
			
	}

}