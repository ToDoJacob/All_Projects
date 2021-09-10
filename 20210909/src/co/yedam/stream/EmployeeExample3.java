package co.yedam.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeExample3 {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList(); // Employee타입을 리스트에 담는다.
		
		// 사원중에서 급여 5000이하 사람들의 이름과 이메일을 출력.
		List<Employee> toList = dao.getEmpList().stream()	//stream 생성
						.filter((t)-> t.getSalary() <= 5000) //e -> e.getSalary() <= 5000
						.collect(Collectors.toList()); //e -> System.out.printf("이름: %s, 이메일: %s\n", e.getLastName(), e.getEmail())
		System.out.println("급여가 5000이하인 사원리스트.");
		for(Employee emp : toList) {
			System.out.println(emp.getLastName() + ", " + emp.getEmail());
		}
		
		Set<Employee> toSet = dao.getEmpList().stream()	//stream 생성
				.filter((t)-> t.getSalary() <= 5000) //e -> e.getSalary() <= 5000
				.collect(Collectors.toSet()); 
		System.out.println("급여가 5000이하인 사원리스트.");
		for(Employee emp : toSet) {
			System.out.println(emp.getLastName() + ", " + emp.getEmail());
		}
		
		
		
		
		
		
		
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
