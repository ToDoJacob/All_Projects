package co.jacob.exception;

//Call by refernce
//Call by value

public class CallByTest {
//	static int a = 10;
	public static void main(String[] args) {

		//Call by value (값에의한 호출)
		int a = 10;
		sub1(a);
		System.out.println(a);
		
		//Call by value : String , Wrapper 클래스는 객체이지만 메서드의 인수로 사용될 경우 value임
//		Integer b = 10;
		String b = "hi";
		sub2(b);		// 밑에  sub2 메서드를 호출한다는 뜻. 
		System.out.println(b);
	}

	//Call by reference(참조에 의한 호출)
	Emp c = new Emp();
	c.name = "홍길동";
	sub3(c);
	System.out.println(c.name);
	}
	
	
	
	public static void sub1(int a) {
		a = a * a;
	}
	
//	public static void sub2(Integer b) {
	public static void sub2(String b) {
//		b = b * b;
		b = "hello";
		System.out.println(b);
	}
	
	public static void sub3(Emp a) { a.name = "이순신"; }
}
