package co.jacob.app.homework;

public class Work3App {

	public static void main(String[] args) {
		Work3 work = new Work3(12, 20);
		int result = work.add();
		System.out.println(result);
		
		System.out.println(work.add());
		
		Work3 work1 = new Work3(10, 20, 30);
	}

}
