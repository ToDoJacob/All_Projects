package co.jacob.app; //co.jacob.app.OracleApp.class

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleApp {
	public static void main(String[] args) {
		String user = "hr";
		String pass = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("연결성공..");
			// 쿼리만들고 -> 쿼리를 실행할 statement객체 -> 화면에 출력.
			String sql = "SELECT * FROM employees";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);// 조회 : executeQuery(), 
												  //입력,수정,삭제 : executeUpdate()
			while (rs.next()) {	//next() => 가져올 요소가 있는지 체크하고 
										//있으면 한건 가져오고 true;
				System.out.print("사원번호 : " + rs.getInt("employee_id"));//getString도 가능
				//자바는 대소문자 구별해야한다. 연결된 단어는 두번째단어 첫번째 글자를 대문자로 
				//ex) EmployeeId
				System.out.print("\t이름 : " + rs.getString("first_name"));
				System.out.print("\t이메일 : " + rs.getString("email"));
				System.out.print("\t급여 : " + rs.getString("salary"));//getInt도 가능
				System.out.println();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end===");

	}
}