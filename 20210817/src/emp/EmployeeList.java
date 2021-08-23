package emp;

public interface EmployeeList {

	//배열객체 선언
	//public >   default  >    private
	//모두      같은패키지    자신 클래스 안
	void init();

	//사원정보 입력 -> 배열에 추가
	void input();

	//사번에 해당하는 이름을 조회
	String search(int employeeId);

	//전체출력
	void print();

	//급여합계
	int sum();

}