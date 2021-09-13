package co.yedam.donggwan;

import java.util.OptionalDouble;

public class Example03 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
			OptionalDouble avg = dao.getEmpList().stream()
					.filter(t -> t.getHireDate().substring(5, 7).equals("05"))
					.mapToInt(t -> t.getSalary())
					.average();

			if(avg.isPresent()) {
				System.out.println("입사일이 5월달인 사원들의 평균급여: "+ avg.getAsDouble());
			} else {
				System.out.println("입사일이 5월달인 사원이 없습니다.");
			}
	}
}
