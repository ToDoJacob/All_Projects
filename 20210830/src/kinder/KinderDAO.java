package kinder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KinderDAO extends DAO {
	Scanner scn = new Scanner(System.in);

//	public void updateK(String kinder) {
//		String sql = "update kinder_info set kinder_name=?, kinder_age=?, kinder_class=?, parent_phone=?";
////		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, kinder.getKinderName());
//			pstmt.setString(2, kinder.getKinderAge());
//			pstmt.setString(3, kinder.getKinderClass());
//			pstmt.setString(4, kinder.getParentPhone());
//
//			pstmt.executeUpdate();
//			System.out.println("원생정보 수정 완료.");
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//	}

	public Kinder insertK(Kinder kinder) {
		String sql = "";
		connect();
		String kid = null;
		try {

			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT NVL(MAX(kinder_id)+1,0) FROM kinder_info");
			if (rs.next()) {
				kid = rs.getString(1);
			}

			sql = "insert into kinder_info(kinder_id,kinder_name,kinder_age,kinder_class,parent_phone,admission_date) values(?,?,?,?,?,TO_CHAR(sysdate, 'yyyy-MM-dd'))";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, kid);
			pstmt.setString(2, kinder.getKinderName());
			pstmt.setString(3, kinder.getKinderAge());
			pstmt.setString(4, kinder.getKinderClass());
			pstmt.setString(5, kinder.getParentPhone());
			pstmt.executeUpdate();

			sql = "select * from kinder_info where kinder_id =? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, kid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				kinder.setKinderId(rs.getString("kinder_id"));
				kinder.setKinderName(rs.getString("kinder_name"));
				kinder.setKinderAge(rs.getString("kinder_age"));
				kinder.setKinderClass(rs.getString("kinder_class"));
				kinder.setParentPhone(rs.getString("parent_phone"));
				kinder.setAdmissionDate(rs.getString("admission_date"));
				
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return kinder;
	}

	public void deleteK(String kinderName) {
		connect();
		int kinderD = 0;
		ResultSet rs = null;
		int i = 0;
		List<Kinder> kinderList = new ArrayList<Kinder>();

		String sql = "select count(kinder_name) from kinder_info where kinder_name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, kinderName);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				i = rs.getInt("count(kinder_name)");
			}

			if (i > 1) { // 중복되는 이름인 학생들이 존재할때 바디를 실행
				Kinder kinder = new Kinder(kinderName);

//				kinder.setKinderName(kinderName);
				kinderList = searchK(kinder);

				connect();
				for (Kinder kd : kinderList) {
					System.out.println(kd.toString()); // for문돌면서 리스트에있는 행을
				} // toString 형식으로 출력
				System.out.println("삭제를 원하는 원생의 번호를 입력하시오>> ");
				kinderD = Integer.parseInt(scn.nextLine());

				sql = "delete from kinder_info where kinder_id = ?";

				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, kinderD);

				if (pstmt.executeUpdate() != 0) {
					System.out.println("학생정보 삭제완료.");
				} else {
					System.out.println("존재하지 않는 원생번호 입니다.");
				}
			} else {

				sql = "delete from kinder_info where kinder_name = ?";

				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, kinderName);

				if (pstmt.executeUpdate() != 0) {
					System.out.println("학생정보 삭제완료.");
				} else {
					System.out.println("존재하지 않는 원생번호 입니다.");
				}

				// *****kinderId가 없으면 없는 Id입니다 표시해주기
				// kinderId말고 kindername으로 검색하고 삭제시키기
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	public void deleteKinder(String id) {
		connect();
		String sql = "delete from kinder_info where kinder_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			int r = pstmt.executeUpdate();
			System.out.println("삭제: " + r);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public List<Kinder> searchK(Kinder kinder) {
		connect();
		List<Kinder> kinderList = new ArrayList<Kinder>();
		String sql = "select kinder_id, kinder_name, kinder_age, kinder_class, TO_CHAR(admission_date, 'yyyy-MM-dd') as admission_date, parent_phone from kinder_info";
		if (kinder.getKinderId() != null && !kinder.getKinderId().equals("")) {
			sql += " where kinder_id like ?";
		} else if (kinder.getKinderName() != null && !kinder.getKinderName().equals("")) {
			sql += " where kinder_name like ?";
		} else if (kinder.getKinderAge() != null && !kinder.getKinderAge().equals("")) {
			sql += " where kinder_age like ?";
		}

		try {
			pstmt = conn.prepareStatement(sql);
			if (kinder.getKinderId() != null && !kinder.getKinderId().equals("")) {
				pstmt.setString(1, kinder.getKinderId());
			} else if (kinder.getKinderName() != null && !kinder.getKinderName().equals("")) {
				pstmt.setString(1, kinder.getKinderName());
			} else if (kinder.getKinderAge() != null && !kinder.getKinderAge().equals("")) {
				pstmt.setString(1, kinder.getKinderAge());
			}

			rs = pstmt.executeQuery();
			while (rs.next()) {
				Kinder kd = new Kinder();
				kd.setKinderId(rs.getString("kinder_id"));
				kd.setKinderName(rs.getString("kinder_name"));
				kd.setKinderAge(rs.getString("kinder_age"));
				kd.setKinderClass(rs.getString("kinder_class"));
				kd.setParentPhone(rs.getString("parent_phone"));
				kd.setAdmissionDate(rs.getString("admission_date"));

				kinderList.add(kd);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return kinderList; // 조회된 결과를 List컬렉션에 담아서 반환.
	}
}
