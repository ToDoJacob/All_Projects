package co.jacob.app.클래스;

public class ClassTest {

	public static void main(String[] args) {
		System.out.println(Member.UNIV_NAME);
		Member m1 = new Member("홍길동");
		Member m2 = new Member();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1.toString());
	}
	
	

}
