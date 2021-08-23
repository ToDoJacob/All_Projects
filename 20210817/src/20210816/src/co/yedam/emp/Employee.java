package co.yedam.emp;

public class Employee {
	
	private int employeeId;			//사번
	private String name;			//이름
	private int departmentId;		//부서번호 10:인사 20:개발 30:영업(기본값)
	private String departmentName;  //부서명
	private int salary;				//급여
	private String email;			//이메일
	
	//기본생성자
	private Employee(){}
	
	
	//사번 이름 초기화 
	public Employee(int employeeId, String name){
		this(employeeId, name, 0, 30);  //부서 번호 없으면 30 기본값 
	}

	//부서번호 초기화
	public Employee(int employeeId, String name, int salary, int departmentId) {
	
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
		
		if (departmentId == 10) {
			this.departmentName = "인사";
		} 
		else if (departmentId == 20) {
			this.departmentName = "개발";
		} 
		else {
			this.departmentName = "영업";
		}
	}
	
	// 사번, 이름, 월급 초기화
	
	public Employee(int employeeId, String name, int salary) {
		this(employeeId, name, salary, 30);      //생성자 호출할 때는 젤 첫번 째 줄에 와야함
	}											// 기본값 30


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
																
	
	
}
