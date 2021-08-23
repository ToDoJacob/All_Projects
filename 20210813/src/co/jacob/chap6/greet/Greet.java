package co.jacob.chap6.greet;
/* 이름을 저장하고 출력하는 프로그램
 * data : 이름
 * 기능 : 이름 출력
 * 		인사말 출력
 */
public class Greet {
	String name = "홍길동";
	
	//생성자의 역할 : 필드를 초기화
	//생성자 : 객체 생성될때 호출되는 특수한 용도의 메서드
	//생성자 하나도없으면 컴파일러가 기본생성자를 만듬 
	//생성자 하나를 선언하면 기본생성자를 만들지 않음 그래서 
	//인수가 있는 생성자를 직접선언을 했다면 인수가없는 기본생성자를 별개로 같이 선언해줘야함
	
	public Greet(String guestname) {
		name = guestname;
	}
	public Greet() {
	}
	
	public void printName() {
		System.out.println(name);
	}
	public void printGreet() {
		System.out.println("방가!!" + name);
	}
}


