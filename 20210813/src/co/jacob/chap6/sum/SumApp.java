package co.jacob.chap6.sum;

public class SumApp {

	public static void main(String[] args) {
		//클래스이름 변수이름 = 객체
		//힙영역에 Sum 
		Sum sum = new Sum();
		//변수 이름.print()
		sum.print();
		
		
		int hap = sum.add();
		System.out.println(hap);
		
		System.out.println(sum.add());
	}

}
