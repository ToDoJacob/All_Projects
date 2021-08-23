package co.jacob.chap6.sum;
//두 수의 합을 계산
//data : int형 두개
//기능 : 두수의합을 출력
public class Sum {
int num1 = 10;
int num2 = 20;


	public int add() {
		int temp;
		temp = num1+num2;
		return temp;
	}

	public void print() {
		System.out.println(num1 + num2);
		return;   // return;은 원래 생략된거라 안써도된다.
	}
}
