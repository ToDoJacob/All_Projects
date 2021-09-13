package kinder;

import java.util.List;
import java.util.Scanner;

public class App {
	static Scanner scn = new Scanner(System.in);
	KinderDAO kinderDao = new KinderDAO();
	Kinder kinder = new Kinder();
	TeacherDAO teacherDao = new TeacherDAO();
	Teacher teacher = new Teacher();

	public static void main(String[] args) {
		App kinderApp = new App();
		//TODO 와일(트루)문을 do while로 바꾸는법알아보기.
		while (true) {
			int menu = 0;
			int menu2 = 0;
			System.out.println("=====1.학생정보 2.선생님정보 3.종료====");
			System.out.print("입력> ");
			menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
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
					kinderApp.deleteK();
				} else {
					System.out.println("메인메뉴로 이동 되었습니다. ");
				}
			} else if (menu == 2) {
				System.out.println("=====1.선생님정보등록 2.선생님정보조회 3.선생님정보수정 4.선생님정보삭제 5.메인메뉴====");
				System.out.print("입력> ");
				menu2 = Integer.parseInt(scn.nextLine());
				if (menu2 == 1) {
					kinderApp.insertT();
				} else if (menu2 == 2) {
					kinderApp.searchT();
				} else if (menu2 == 3) {
					kinderApp.updateT();
				} else if (menu2 == 4) {
					kinderApp.deleteT();
				} else {
					System.out.println("메인메뉴로 이동 되었습니다. ");
				}
			} else if (menu == 3) {
				System.out.println("종료 되었습니다.");
				break;
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
		//TODO 입학날짜 뒤에 00:00:00 안보이게 출력하는 방법 공부하기.
	}

	public void insertT() {
		String kinderClass;
		String teacherName;
		System.out.print("선생님 성함> ");
		teacherName = scn.nextLine();
		System.out.print("담당반> ");
		kinderClass = scn.nextLine();

		teacherDao.insertT(new Teacher(null, teacherName, kinderClass, null));
		System.out.println("입력이 완료되었습니다.");
	}

	public void searchK() {
		System.out.println("원생 이름을 입력>>");
		String kinderName = scn.nextLine();

		System.out.println("원생 나이를 입력>>");
		String kinderAge = scn.nextLine();

		kinder = new Kinder(kinderName,kinderAge);

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

		teacher = new Teacher(teacherName,kinderClass);
		
		List<Teacher> list = teacherDao.searchT(teacher);
		for (Teacher tc : list) {
			System.out.println(tc.toString());
		}
		
	}

	public void deleteK() {
		System.out.println("삭제할 학생이름 입력>>");
		String kinderName = scn.nextLine();

		kinder.setKinderName(kinderName);
		List<Kinder> list = kinderDao.searchK(kinder);
		for (Kinder kd : list) {
			System.out.println(kd.toString());
		} //TODO 삭제할 학생이름이 한명뿐일때 바로 삭제되는 기능 추가하기.
		System.out.println("삭제할 학생번호 입력>>");
		String num = scn.nextLine();
		kinderDao.deleteK(num);

	}

	public void deleteT() {
		System.out.println("삭제할 선생님이름 입력>>");
		String teacherName = scn.nextLine();
		
		teacher = new Teacher(teacherName);
		List<Teacher> list = teacherDao.searchT(teacher);
		for (Teacher tc : list) {
			System.out.println(tc.toString());
		}
		System.out.println("삭제할 선생님번호 입력>>");
		String num = scn.nextLine();
		teacherDao.deleteT(num);
	}

	public void updateK() {
		System.out.println("수정할 원생이름 입력>>");
		String name = scn.nextLine();
		
		
		kinder.setKinderName(name);
	
		List<Kinder> list = kinderDao.searchK(kinder);
		if(list != null) {
			for (Kinder kd : list) {
				System.out.println(kd.toString());
		}
		}else {
			System.out.println("수정할 해당 원생이 없습니다.");
			}
		
		
		System.out.println("수정 하고 싶은 원생의 번호 입력>>");
		String num = scn.nextLine();
		System.out.println("수정 할 원생이름 입력>>");
		String kinderName = scn.nextLine(); 
		System.out.println("수정 할 원생나이 입력>>");
		String kinderAge = scn.nextLine();
		System.out.println("수정 할 반 입력>>");
		String kinderClass = scn.nextLine();
		System.out.println("수정 할 부모님 연락처 입력>>");
		String parentPhone = scn.nextLine();
		kinderDao.updateK(new Kinder(num, kinderName, kinderAge, kinderClass, parentPhone, null));
		System.out.println("원생정보 수정 완료");
		

	}

	public void updateT() {
		System.out.println("수정할 선생님이름 입력>>");
		String name = scn.nextLine();
		
		
		teacher.setTeacherName(name);
	
		List<Teacher> list = teacherDao.searchT(teacher);
		if(list != null) {
			for (Teacher tc : list) {
				System.out.println(tc.toString());
		}
		}else {
			System.out.println("수정할 해당 선생님이 없습니다.");
			}
		
		
		System.out.println("수정 하고 싶은 선생님의 번호 입력>>");
		String num = scn.nextLine();
		System.out.println("수정 할 선생님이름 입력>>");
		String teacherName = scn.nextLine(); 
		System.out.println("수정 할 담당반 입력>>");
		String kinderClass = scn.nextLine();
		teacherDao.updateT(new Teacher(num, teacherName, kinderClass, null));
		System.out.println("원생정보 수정 완료");
		

	}

}
