package co.yedam.stream;

public class Employee implements Comparable<Employee> {
	private int employeeId;
	private String lastName;
	private String email;
	private String hireDate;
	private String jobId;
	private int salary;
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	@Override
	public int compareTo(Employee o) {
		return o.getLastName().compareTo((this.getLastName())); // 소문자부터 내림차순으로 정렬하고 
																//그뒤에 대문자 내림차순으로 정렬
		
		
		
//		return o.salary - this.salary; 음수가 나오면 작은수가 먼저나온다.
	}
	
	
}
