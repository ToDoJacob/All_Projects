package kinder2;

import java.util.List;
import java.util.Scanner;


public class KinderApp {
	static Scanner scn = new Scanner(System.in);
	KinderDAO kinderDao = new KinderDAO();
	
	public static void main(String[] args) {
		KinderApp kinderApp = new KinderApp();
	
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
		String kinderName;
		String kinderAge;
		String kinderClass;
		String phoneno;
		System.out.print("학생이름> ");
		kinderName = scn.nextLine();
		System.out.print("나이> ");
		kinderAge = scn.nextLine();;
		System.out.print("반> ");
		kinderClass = scn.nextLine();
		System.out.print("부모님 연락처> ");
		phoneno = scn.nextLine();
		kinderDao.insertK(new Kinder(kinderName, kinderAge, kinderClass, phoneno));
		
	}
	public void inputT() {
		String teacherId;
		String team;
		String teacherName;
		String entryDate;
		System.out.print("선생님 번호> ");
		teacherId = scn.nextLine();
		System.out.print("선생님 성함> ");
		teacherName = scn.nextLine();
		System.out.print("담당반> ");
		team = scn.nextLine();
		System.out.print("입사일> ");
		entryDate = scn.nextLine();
		
		kinderDao.insertT(new Kinder(teacherId, team, teacherName, entryDate));
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
		
		List<Kinder> kinderList = kinderDao.serachKinder(kinder);
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
		System.out.println("삭제할 학생코드 입력>>");
		String kinderId = scn.nextLine();
		
		kinderDao.deleteK(kinderId);
	}
	public void removeT() {
		System.out.println("삭제할 선생님코드 입력>>");
		String teacherId = scn.nextLine();
		
		kinderDao.deleteK(teacherId);
	}
	
	public void modifyK() {
		
	}

}
