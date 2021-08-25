package co.jacob.employee;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDAO extends DAO {// 부모클래스 DAO의 모든 메서드 상속
	// Connection, ResultSet, Statement, connect(), disconnect()

	// 추가기능.(조회, 입력 . . . )
	public void getEmpList() {
		connect();// 연결객체를 만들어주는 메서드를 호출해야지 된다.
		String sql = "SELECT * FROM employees";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);// 조회 : executeQuery(),
										// 입력,수정,삭제 : executeUpdate()
			while (rs.next()) { // next() => 가져올 요소가 있는지 체크하고
								// 있으면 한건 가져오고 true;
				System.out.print("사원번호 : " + rs.getInt("employee_id"));// getString도 가능
				// 자바는 대소문자 구별해야한다. 연결된 단어는 두번째단어 첫번째 글자를 대문자로
				// ex) EmployeeId
				System.out.print("\t이름 : " + rs.getString("first_name"));
				System.out.print("\t이메일 : " + rs.getString("email"));
				System.out.print("\t급여 : " + rs.getString("salary"));// getInt도 가능
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// end of getEmpList()

	// 한건 추가 기능
	void insrtEmp(String empId, String lastName, String email, String hireDate, String jobId) {
		String sql = "INSERT INTO employees(email, hire_date,job_id,last_name, employee_id)\r\n" + "values(\'" + email
				+ "\', \'" + hireDate + "\', \'" + jobId + "\', \'" + lastName + "\', \'" + empId + "\')";
		System.out.println(sql);
		// connection은 하나의 변수에 여러가지값을 담을 수 있다.
		connect(); // conn = 객체
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);// 작성한 sql쿼리를 실행
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end====");
	}
	// 수정본

	void insrtEmp(Employee emp) {
		String sql = "INSERT INTO employees(email, hire_date,job_id,last_name, employee_id)\r\n" + "values(\'"
				+ emp.getEmail() + "\', \'" + emp.getHireDate() + "\', \'" + emp.getJobId() + "\', \'" + emp.getLastName() + "\', \'"
				+ emp.getEmployeeId() + "\')";
		System.out.println(sql);
		// connection은 하나의 변수에 여러가지값을 담을 수 있다.
		connect(); // conn = 객체
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);// 작성한 sql쿼리를 실행
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end====");
	} // end of insertEmp
	
	void updateEmp(Employee emp) {
		String sql = "update employees set email = ? where employee_id = ?";
		connect();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, emp.getEmail());//?로 지정해주고 나중에 값을 정해준다는뜻
			psmt.setInt(2, emp.getEmployeeId());
			int r = psmt.executeUpdate();
			System.out.println(r+"건 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	void deleteEmp(int eno) {
		//쿼리 .
		//psmt 객체. 파라미터 처리
		//psmt.executeUpdate.
	}
}