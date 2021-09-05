package co.jacob.kinder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KinderDAO {
	String user = "hr";
	String pw = "hr";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	protected Connection conn;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
//	private Connection getConnection() {
//		String user = "hr";
//		String pw = "hr";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		Connection conn = null;
	protected void getConn() {
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
//		return conn;
		}
	
	protected void disConn() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	public void insertK(Kinder kinder) {
		
		PreparedStatement pstmt = null;
		String sql = "";
		Connection conn = null;
		try {
			
			sql = "insert into kinder_info values(?,?,?,?,sysdate,?)";
			
			pstmt = conn.prepareStatement(sql); 
			pstmt.setString(1, kinder.getKinderId());
			pstmt.setString(2, kinder.getLastName() );
			pstmt.setInt(3, kinder.getKinderAge());
			pstmt.setString(4, kinder.getKinderClass());
			pstmt.setString(5, kinder.getParentPhone());
			pstmt.executeUpdate();
			
			sql = "select * from kinder_info where kinder_id = ?";
			pstmt = conn.prepareStatement(sql); 
			pstmt.setString(1, kinder.getKinderId());
			
			
			System.out.println("학원생 정보가 등록되었습니다.");
			conn.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void insertT(Kinder teacher) {
		PreparedStatement pstmt = null;
		String sql = "";
		Connection conn = null;
		try {
				
			sql = "insert into teacher_info values(?,?,?,sysdate)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teacher.getTeacherName());
			pstmt.setString(2, teacher.getTeamIncharge());
			pstmt.setString(3, teacher.getLastName());
			
			sql = "select * from teacher_info where theacher_id = ?";
			pstmt.setString(1, teacher.getEntryDate());
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

