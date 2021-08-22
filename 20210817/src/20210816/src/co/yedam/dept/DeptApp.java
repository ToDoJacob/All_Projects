package co.yedam.dept;

import co.yedam.emp.Employee;
import co.yedam.emp.EmployeeList;

public class DeptApp {
	public static void main(String[] args) {
		
		EmployeeList app = EmployeeList.getInstance();
		app.init();
	}

}
