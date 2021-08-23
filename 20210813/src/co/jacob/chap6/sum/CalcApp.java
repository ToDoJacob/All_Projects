package co.jacob.chap6.sum;

public class CalcApp {

	public static void main(String[] args) {
		Calc calc = new Calc(10,20);
		System.out.println(calc.add());
		
		int subResult = calc.sub();
		System.out.println(subResult);
		
		calc.mul();
		System.out.println(calc.mul());
		
		System.out.println(calc.div());
	}

}
