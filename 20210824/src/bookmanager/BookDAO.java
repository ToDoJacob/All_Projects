package bookmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {
	//필드 메서드 클래스
	private Connection getConnection() {
		String user = "test";
		String password = "test";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
		}

	
	public void insert(Book b) {

		PreparedStatement pstmt = null;
		String sql = "";
		Connection conn = null;
		try {
			conn = this.getConnection();
			if (!insertCheck(b.getIsbn())) {
				sql = "insert into booklist values(?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, b.getIsbn());
				pstmt.setString(2, b.getName());
				pstmt.setString(3, b.getContent());
				pstmt.executeUpdate();
				System.out.println("등록되었습니다.");
			} else {
				System.out.println("중복되는 isbn입니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeJDBC(conn, pstmt, null);
		}
	}

	public boolean insertCheck(String b) {
		PreparedStatement pstmt = null;
		String sql = "";
		Connection conn = null;
		ResultSet rs = null;
		boolean flag = false;
		try {

			conn = this.getConnection();
			sql = "select * from booklist";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); // developer에서 run 역할
			while (rs.next()) {
				if (rs.getString("isbn").equals(b)) {
					flag = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeJDBC(conn, pstmt, rs);
		}
		return flag;
	}

	public void searchAll() {
		PreparedStatement pstmt = null;
		String sql = "";
		Connection conn = null;
		ResultSet rs = null;
		try {
			conn = this.getConnection();
			sql = "select * from booklist";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("isbn") +"\t" + rs.getString("name") + "\t" + rs.getString("content"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeJDBC(conn, pstmt, rs);
		}
	}
	
	public int delete(String name) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		try {
			conn = this.getConnection();
			pstmt = conn.prepareStatement("delete from booklist where name like '%'||?||'%'");
			pstmt.setString(1, name);
			return pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			closeJDBC(conn, pstmt, null);
		}
		return 0;
	}
	public void closeJDBC(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
