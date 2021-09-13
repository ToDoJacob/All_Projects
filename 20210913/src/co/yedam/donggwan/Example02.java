package co.yedam.donggwan;

import java.util.OptionalInt;

public class Example02 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
			OptionalInt max = dao.getEmpList().stream().filter(t -> t.getJobId().equals("ST_CLERK"))
					.mapToInt(t -> t.getSalary()).max();

			if(max.isPresent()) {
				System.out.println("ST부서의 최고 급여: " + max.getAsInt());
			} else {
				System.out.println("ST부서의 소속인 사원이 없습니다.");
			}
	}
}
