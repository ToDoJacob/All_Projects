package co.jacob.chap6.insa;

public class MainApp {

	public static void main(String[] args) {
		Departments dept = new Departments();
		dept.departmentId = 10;
		dept.departmentName = "인사";
		
		Departments dept1 = new Departments("기획");
		Departments dept2 = new Departments(30,"개발");
		Departments dept3 = new Departments(40,"총무", 100, 7000);
		
		System.out.println(dept1.toString());
		System.out.println(dept2.toString());
		System.out.println(dept3.toString());            // ====>toString 생략가능
				
				
		//사원
			Employees emp = new Employees(100,"김유미");
			Employees emp1 = new Employees(101,"홍길동", dept1 );
			Employees emp2 = new Employees(102,"김기자", new Departments(30,"개발"));
			
		//emp1 사원의 부서명을 출력
		System.out.println(emp1.dept.departmentName);
	
		Employees emp3 = new Employees(100,"김유미");
	    System.out.println(emp3.dept);    //----> Null상태
	    System.out.println(emp3.dept.departmentName);   // ----> 널의 departmentName을 보려니까 NullPoint에러뜬다.
	}
	
	

}
