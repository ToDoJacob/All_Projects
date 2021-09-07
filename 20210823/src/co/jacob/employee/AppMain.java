package co.jacob.employee;

public class AppMain {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
//		dao.getEmpList();

		
		//한건입력
		String lastName = "Hongkildong";
		String email = "hong@email";
		String hireDate = "2021-08-01";
		String empId = "305";
		String jobId = "IT_PROG";
		
//		Employee emp  = new Employee(303, "hong", "NEW@HONH@EMAIL","2021-08-01", "IT_PROG");
		Employee emp = new Employee();
		
//		emp.employeeId = 306;
		emp.setEmployeeId(306);
//		emp.lastName = "hong"
		emp.setLastName("hong");
//		emp.email = "newhong@email2";
		emp.setEmail("newhong@email2");
//		emp.jobId = "IT_PROG";
		emp.setJobId("IT_PROG");
//		emp.hireDate = "2021-08-01";
		emp.setHireDate("2021-08-01");
		
		

//		dao.insrtEmp(empId, lastName, email, hireDate, jobId);
//		dao.insrtEmp(emp);
		dao.updateEmp(emp);
//		dao.deleteEmp(300);
		}

}
