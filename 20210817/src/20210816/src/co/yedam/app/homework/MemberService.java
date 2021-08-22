package co.yedam.app.homework;

import java.util.Scanner;

public class MemberService {
	
	
	Member[] service;		//회원 정보 배열 
	int cnt;
	Scanner sc = new Scanner(System.in);
	
	//기본 생성자
	MemberService(){}
	
	//생성자 초기화 
	MemberService(Member[] service){
		this.service = service;
		this.cnt = service.length;
	}
	
	void insert() {
		System.out.print("id:");
		String id = sc.nextLine();
		
		System.out.print("name:");
		String name = sc.nextLine();
		
		System.out.print("password:");
		String password = sc.nextLine();
		
		System.out.print("age:");
		int age = sc.nextInt();
		
		service[cnt++] = new Member(id, name, password, age);
	}
	void printList() {
		for(int i =0;i<cnt;i++) { //입력된 사원 수 만큼만 for
			System.out.printf("%s\t %s\t %s\t %d\n",
							service[i].id,
							service[i].name,
							service[i].password,
							service[i].age);
		}
	}
		
		boolean login(String id, String password) {
						
			for(int i =0;i<service.length;i++) {
				if((id == service[i].id) && (password == service[i].password)) {
					boolean result = true;
					return result;
				}
			}
	}
	
}
