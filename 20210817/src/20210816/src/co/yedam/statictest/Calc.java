package co.yedam.statictest;

/*
 *  초기화는 필드 선언시 or 생성자에서만 초기화 할 수 있따.
*/
public class Calc {
	
	final String color ;				//인스턴스 변수는 객체 생성을 해야 사용가능 
	static final double pi = 3.14;
	
	Calc(){
		this.color = "blue";
	}
	
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus (int x, int y) {
		return x-y;
	}
	
	

}
