package kinder;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherDAO extends DAO {
	public void insertT(Teacher teacher) {
		connect();
		try {
			String sql = "insert into teacher_info values((SELECT NVL(MAX(teacher_id)+1,0) FROM teacher_info),?,?,sysdate)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teacher.getTeacherName());
			pstmt.setString(2, teacher.getKinderClass());
			pstmt.executeUpdate();
			
			sql = "select * from teacher_info where teacher_id = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teacher.getTeacherId());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
			System.out.println("선생님번호> " + rs.getString("teacher_id"));
			System.out.println("입사일> " + rs.getString("entry_date"));
			
			}
			System.out.println("선생님 정보가 등록되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	public void deleteT(String teacherId) {
		connect();
		String sql = "delete from teacher_info where teacher_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teacherId);
			
			pstmt.executeUpdate();
			System.out.println("선생님정보 삭제완료.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		
	}
	public void updateT(Teacher teacher) {
		String sql = "update teacher_info set teacher_name=?, kinder_class=? where teacher_id = ?";
		connect();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teacher.getTeacherName());
			pstmt.setString(2, teacher.getKinderClass());
			pstmt.setString(3, teacher.getTeacherId());
			pstmt.executeUpdate();
			System.out.println("선생님정보 수정 완료.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	public List<Teacher> searchT(Teacher teacher){
		connect();
		List<Teacher> teacherList = new ArrayList<Teacher>();
		String sql = "select teacher_id,teacher_name,kinder_class,TO_CHAR(entry_date, 'yyyy-MM-dd') as entry_date from teacher_info";
		if (teacher.getTeacherId() != null && !teacher.getTeacherId().equals("")) {
			sql += " where teacher_id like ?";
		} else if (teacher.getTeacherName() != null && !teacher.getTeacherName().equals("")) {
			sql += " where teacher_name like ?";
		} else if (teacher.getKinderClass() != null && !teacher.getKinderClass().equals("")) {
			sql += " where kinder_class like ?";
		}
		try {
			pstmt = conn.prepareStatement(sql);
			if (teacher.getTeacherId() != null && !teacher.getTeacherId().equals("")) {
				pstmt.setString(1, teacher.getTeacherId());
			} else if (teacher.getTeacherName() != null && !teacher.getTeacherName().equals("")) {
				pstmt.setString(1, teacher.getTeacherName());
			} else if (teacher.getKinderClass() != null && !teacher.getKinderClass().equals("")) {
				pstmt.setString(1, teacher.getKinderClass());
			}
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Teacher tc = new Teacher();
				tc.setTeacherId(rs.getString("teacher_id"));
				tc.setTeacherName(rs.getString("teacher_name"));
				tc.setKinderClass(rs.getString("kinder_class"));
				tc.setEntryDate(rs.getString("entry_date"));

				teacherList.add(tc);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return teacherList; 
	}

}
