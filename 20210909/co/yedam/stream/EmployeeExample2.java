package co.yedam.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmployeeExample2 {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();
		
		// 사원중에서 급여 5000이하 사람들의 이름과 이메일을 출력.
		dao.getEmpList().stream()	//stream 생성
						.filter(new Predicate<Employee>() {

							@Override
							public boolean test(Employee t) {
								return t.getSalary() <= 5000;
							}}) //t -> t.getSalary() <= 5000
						.forEach(new Consumer<Employee>() {

							@Override
							public void accept(Employee e) {
								System.out.printf("이름: %s, 이메일: %s\n", 
										e.getLastName(), e.getEmail());
							}}); //e -> System.out.printf("이름: %s, 이메일: %s\n", e.getLastName(), e.getEmail())
		
		
		
		
		
		
		
		
//		list.stream()
//			.filter(new Predicate<Employee>() {
//
//				@Override
//				public boolean test(Employee t) {
//					return t.getSalary() <= 5000;
//				}
//			});
		
		
		
//			.mapToInt(new ToIntFunction<Employee>() {
//
//				@Override
//				public int applyAsInt(Employee t) {
//					return t.getLastName();
//				}
//				
//			})
		
		
	}

}
