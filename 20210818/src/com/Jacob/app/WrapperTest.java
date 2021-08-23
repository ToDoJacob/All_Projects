package com.Jacob.app;

/*객체화
타입변환
int -> long (int)
객체간은 부모와 자식 (부모)
String -> int, long, date
*/
public class WrapperTest {

	public static void main(String[] args) {
		//1.객체화   int <-> Integer
		int a=10;
		Integer b = Integer.valueOf(a); //boxing
		b = a;	//auto boxing
		
		a = b;		//auto unboxing 
		a = b.intValue();	//unboxing
		
		//2. 타입변환
		
		//캐스팅
		//int -> String
//		String c = a;		//X
		String c = Integer.toString(a);		//O
		
		//String -> int
		a = Integer.parseInt(c);
		
		//double -> String
		double d = 10.5;
		c = Double.toString(d);
		c = String.valueOf(d);
		
		//String -> double
		d = Double.parseDouble(c);
		
		//3.진수변환
		int e = 15;
		String r1 = Integer.toBinaryString(e);	//2진수
		String r2 = Integer.toOctalString(e);	//8진수
		System.out.println(r1 + ":" + r2);
		
		
		
		
		
		
	}

}
