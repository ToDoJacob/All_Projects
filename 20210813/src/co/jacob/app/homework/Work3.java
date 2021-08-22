package co.jacob.app.homework;

//두수 계산기
public class Work3 {
//두수의 합 add()메소드 만들기
	int num1;
	int num2;
	int num3;
	
	public Work3(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int add() {
		return num1+num2;
	}

	
	public int add2() {
		return num1+num2+num3;
	}
}
//세 수의 합 매개변수로 받은 수들의 합을 계산해서 리턴

