package kinder2;

import java.util.List;
import java.util.Scanner;


public class App {
	static Scanner scn = new Scanner(System.in);
	KinderDAO kinderDao = new KinderDAO();
	TeacherDAO teacherDao = new TeacherDAO();
	
	public static void main(String[] args) {
		App kinderApp = new App();
	
		while(true) {
			int menu = 0;
			int menu2 = 0;
			System.out.println("=====1.학생정보 2.선생님정보 3.종료====");
			System.out.print("입력> ");
			menu = Integer.parseInt(scn.nextLine());
			
			if(menu==1) {
//				menu2 = 0;
				System.out.println("=====1.학생정보등록 2.학생정보삭제 3.학생정보조회 4.메인메뉴====");
				System.out.print("입력> ");
				menu2 = Integer.parseInt(scn.nextLine());
				if(menu2==1) {
					kinderApp.inputK();
				}
				else if(menu2==2) {
					kinderApp.removeK();
				}
				else if(menu2==3) {
					kinderApp.searchK();
				}
				else {
					System.out.println("메인메뉴로 이동 되었습니다. ");
				} 
			}
			else if(menu==2) {
//				menu2 = 0;
				System.out.println("=====1.선생님정보등록 2.선생님정보삭제 3.조회 4.메인메뉴====");
				System.out.print("입력> ");
				menu2 = Integer.parseInt(scn.nextLine());
				if(menu2==1) {
					kinderApp.inputT();
				}
				else if(menu2==2) {
					kinderApp.removeT();
				}
				else if(menu2==3) {
					System.out.println("수정> ");
				}
				else if(menu2==4) {
					System.out.println("조회> ");
//					input();
				}else {
					System.out.println("메인메뉴로 이동 되었습니다. ");
				}
			}
			else if(menu==3) {
				System.out.println("종료 되었습니다.");
			}
		}
		
		
		
	}
	
	public void inputK() {
		String kinderId = null;
		String kinderName;
		String kinderAge;
		String kinderClass;
		String parentPhone;
		String admissionDate = null;
		System.out.print("학생이름> ");
		kinderName = scn.nextLine();
		System.out.print("나이> ");
		kinderAge = scn.nextLine();;
		System.out.print("반> ");
		kinderClass = scn.nextLine();
		System.out.print("부모님 연락처> ");
		parentPhone = scn.nextLine();
		kinderDao.insertK(new Kinder(kinderId, kinderName, kinderAge, kinderClass, parentPhone, admissionDate));
		
	}
	public void inputT() {
		String charge;
		String teacherName;
		System.out.print("선생님 성함> ");
		teacherName = scn.nextLine();
		System.out.print("담당반> ");
		charge = scn.nextLine();
		
		teacherDao.insertT(new Teacher(teacherName,charge));
		System.out.println("입력이 완료되었습니다.");
	}
	
	public void searchK() {
		System.out.println("원생 번호를 입력>>");
		String kinderId = scn.nextLine();
		
		System.out.println("원생 이름을 입력>>");
		String kinderName = scn.nextLine();
		
		System.out.println("원생 나이를 입력>>");
		String kinderAge = scn.nextLine();
		
		Kinder kinder = new Kinder();
		kinder.setKinderId(kinderId);
		kinder.setKinderName(kinderName);
		kinder.setKinderAge(kinderAge);
		
		List<Kinder> kinderList = kinderDao.searchK(kinder);
		for (Kinder kd : kinderList) {
			System.out.println(kd.toString());
		}
	}
	
	public void searchT() {
		System.out.println("선생님 번호를 입력>>");
		String teacherId = scn.nextLine();
		
		System.out.println("선생님 이름을 입력>>");
		String teacherName = scn.nextLine();
		
		System.out.println("담당반을 입력>>");
		String kinderClass = scn.nextLine();
		
		Kinder teacher = new Kinder();
		teacher.setKinderId(teacherId);
		teacher.setKinderName(teacherName);
		teacher.setKinderAge(kinderClass);
	}
	
	public void removeK() {
		System.out.println("삭제할 학생이름 입력>>");
		String kinderName = scn.nextLine();
		
		kinderDao.deleteK(kinderName);
	}
	public void removeT() {
		System.out.println("삭제할 선생님이름 입력>>");
		String teacherName = scn.nextLine();
		
		kinderDao.deleteK(teacherName);
	}
	
	public void modifyK() {
		
	}

}
