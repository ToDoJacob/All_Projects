package kinder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	static Scanner scn = new Scanner(System.in);
	KinderDAO kinderDao = new KinderDAO();
	TeacherDAO teacherDao = new TeacherDAO();

	public static void main(String[] args) {
		App kinderApp = new App();

		while (true) {
			int menu = 0;
			int menu2 = 0;
			System.out.println("=====1.학생정보 2.선생님정보 3.종료====");
			System.out.print("입력> ");
			menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
//				menu2 = 0;
				System.out.println("=====1.학생정보등록 2.학생정보조회 3.학생정보수정 4.학생정보삭제 5.메인메뉴====");
				System.out.print("입력> ");
				menu2 = Integer.parseInt(scn.nextLine());
				if (menu2 == 1) {
					kinderApp.insertK();
				} else if (menu2 == 2) {
					kinderApp.searchK();
				} else if (menu2 == 3) {
					kinderApp.updateK();
				} else if (menu2 == 4) {
					kinderApp.removeK();
				} else {
					System.out.println("메인메뉴로 이동 되었습니다. ");
				}
			} else if (menu == 2) {
//				menu2 = 0;
				System.out.println("=====1.선생님정보등록 2.선생님정보조회 3.선생님정보수정 4.선생님정보삭제 5.메인메뉴====");
				System.out.print("입력> ");
				menu2 = Integer.parseInt(scn.nextLine());
				if (menu2 == 1) {
					kinderApp.inputT();
				} else if (menu2 == 2) {
					kinderApp.searchT();
				} else if (menu2 == 3) {
					kinderApp.updateT();
				} else if (menu2 == 4) {
					kinderApp.removeT();
				} else {
					System.out.println("메인메뉴로 이동 되었습니다. ");
				}
			} else if (menu == 3) {
				System.out.println("종료 되었습니다.");
			}
		}

	}

	public void insertK() {
		String kinderName;
		String kinderAge;
		String kinderClass;
		String parentPhone;
		System.out.print("학생이름> ");
		kinderName = scn.nextLine();
		System.out.print("나이> ");
		kinderAge = scn.nextLine();
		System.out.print("반> ");
		kinderClass = scn.nextLine();
		System.out.print("부모님 연락처> ");
		parentPhone = scn.nextLine();
		Kinder k = 	kinderDao.insertK(new Kinder(null, kinderName, kinderAge, kinderClass, parentPhone, null));
		System.out.println("학생번호 : " + k.getKinderId() + "\t입학날짜 : " + k.getAdmissionDate());

	}

	public void inputT() {
		String charge;
		String teacherName;
		System.out.print("선생님 성함> ");
		teacherName = scn.nextLine();
		System.out.print("담당반> ");
		charge = scn.nextLine();

		teacherDao.insertT(new Teacher(teacherName, charge));
		System.out.println("입력이 완료되었습니다.");
	}

	public void searchK() {
		System.out.println("원생 이름을 입력>>");
		String kinderName = scn.nextLine();

		System.out.println("원생 나이를 입력>>");
		String kinderAge = scn.nextLine();

		Kinder kinder = new Kinder();
		kinder.setKinderName(kinderName);
		kinder.setKinderAge(kinderAge);

		List<Kinder> list = kinderDao.searchK(kinder);
		for (Kinder kd : list) {
			System.out.println(kd.toString());
		}
	}

	public void searchT() {
		System.out.println("선생님 이름을 입력>>");
		String teacherName = scn.nextLine();

		System.out.println("담당반을 입력>>");
		String kinderClass = scn.nextLine();

		Kinder teacher = new Kinder();
		teacher.setKinderName(teacherName);
		teacher.setKinderAge(kinderClass);
	}

	public void removeK() {
		System.out.println("삭제할 학생이름 입력>>");
		String kinderName = scn.nextLine();

//		kinderDao.deleteK(kinderName);
		KinderDAO dao = new KinderDAO();
		Kinder kinder = new Kinder();
		kinder.setKinderName(kinderName);
		List<Kinder> list = dao.searchK(kinder);
		for (Kinder kd : list) {
//			System.out.printf("학생번호: %s, 학생이름: %s\n", k.getKinderId(), k.getKinderName());
			System.out.println(kd.toString());
		}
		System.out.println("삭제할 학생번호 입력>>");
		String num = scn.nextLine();
		dao.deleteKinder(num);

	}

	public void removeT() {
		System.out.println("삭제할 선생님이름 입력>>");
		String teacherName = scn.nextLine();

		kinderDao.deleteK(teacherName);
	}

	public void updateK() {
		System.out.println("수정할 원생이름 입력>>");
		String kinderName = scn.nextLine();

//		kinderDao.updateK(kinderName);
	}

	public void updateT() {

	}

}
