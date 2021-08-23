package co.yedam.app.homework;

public class Member {

	String id;
	String name;
	String password;
	int age;
	
	//기본 생성자
	Member(){}
	
	//아이디, 이름, 비밀번호 초기화
	Member(String id, String name, String password, int age){
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
