package co.yedam.donggwan;

import java.util.List;

public class Example01 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();

		list.stream().filter(e -> 5000 <= e.getSalary() && e.getSalary() <= 10000)
				.forEach(e -> System.out.printf("사원번호: %s, 이름: %s, 이메일: %s, 급여 정보: %s\n", 
						e.getEmployeeId(), e.getLastName(), e.getEmail(), e.getSalary()));
		
	}
}