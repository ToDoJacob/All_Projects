package co.jacob.chap6.sum;

public class Calc {

	int num1;
	int num2;
	//두수 초기화
	public Calc(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	//합계
	public int add() {
		return num1+num2;
	}
	//뺄셈
	public int sub() {						//return 뒤의 객체의 타입을 public 뒤에 써준다.
		return num1-num2;					//되돌릴 값이 없으면 위에 void 라고 쓴다.
	}
	//곱셈
	public int mul() {
		return num1*num2;
	}
	//나눗셈
	public double div() {
		return (double)num1/num2;
	}
}
