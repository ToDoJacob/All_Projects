package co.jacob.kinder;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class KinderApp {
	static Scanner scn = new Scanner(System.in);
	KinderDAO kinderDao = new KinderDAO();
	
	public static void main(String[] args) {
		KinderApp kinderApp = new KinderApp();
		
//		int menu = 0;
//		int menu2 = 0;
		while(true) {
			int menu = scn.nextInt();
			int menu2 = scn.nextInt();
			System.out.println("=====1.학생정보 2.선생님정보 3.종료====");
			System.out.print("입력> ");
//			menu = Integer.parseInt(scn.nextLine());
			
			if(menu==1) {
				System.out.println("=====1.등록 2.삭제 3.조회 4.종료====");
				System.out.print("입력> ");
				menu2 = Integer.parseInt(scn.nextLine());
				if(menu2==1) {
					kinderApp.input();
				}
				else if(menu2==2) {
					System.out.println("삭제할 학생이름 입력> ");
//					delete();
				}
				else if(menu2==3) {
					System.out.println("조회> ");
//					input();
				}else {
					System.out.println("종료 되었습니다. ");
				}
			}
			if(menu==2) {
				System.out.println("=====1.입력 2.삭제 3.조회 4.종료====");
				if(menu==1) {
					System.out.println("입력> ");
					kinderApp.inputT();
				}
				else if(menu==2) {
					System.out.println("삭제 할 선생님성함 입력> ");
//					delete();
				}
				else if(menu==3) {
					System.out.println("조회> ");
//					input();
				}else {
					System.out.println("종료 되었습니다. ");
				}
			}
			if(menu==3) {
				System.out.println("종료 되었습니다.");
			}
		}
		
		
		
	}
	
	public void input() {
//		LocalDate now = LocalDate.now();
		String idno;
		String name;
		int age;
		String group;
		String date;
		String phoneno;
		System.out.print("원생번호> ");
		idno = scn.nextLine();
		System.out.print("학생이름> ");
		name = scn.nextLine();
		System.out.print("나이> ");
		age = scn.nextInt();
		System.out.print("반> ");
		group = scn.nextLine();
		System.out.print("부모님 연락처> ");
		phoneno = scn.nextLine();
//		System.out.println("입학일> " + now);
//		date = now;
		System.out.print("입학일> ");
		date = scn.nextLine();
		
		kinderDao.insertK(new Kinder(idno, name, age, group, phoneno, date));
		
	}
	public void inputT() {
		LocalDate now = LocalDate.now();
		String tName;
		String team;
		String entryDate;
		System.out.print("선생님 성함> ");
		tName = scn.nextLine();
		System.out.print("담당반> ");
		team = scn.nextLine();
		System.out.print("입사일> ");
		entryDate = scn.nextLine();
		
		kinderDao.insertT(new Kinder(tName, team, entryDate));
	}

}
