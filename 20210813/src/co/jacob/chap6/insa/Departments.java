package co.jacob.chap6.insa;

public class Departments {
	int departmentId;//부서번호
	String departmentName;//부서명
	int managerID;//매니저
	int locationId;//지역
	
	//생성자 오버로딩
	//기본생성자
	Departments(){}
	//부서명 초기화
	Departments(String departmentName) {
		this.departmentName = departmentName;
	}
	//부서번호, 부서명 초기화
	Departments(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
	//필드 4개 초기화
	public Departments(int departmentId, String departmentName, int managerID, int locationId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerID = managerID;
		this.locationId = locationId;
	}
	
//	int print() {
//		return departmentId +":" + departmentName;
//	}
	
	@Override
	public String toString() {
		return "Departments [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerID="
				+ managerID + ", locationId=" + locationId + "]";
	}

	
	
}
