package co.yedam.common;

interface Runnable {
	void run();
}

class RunClass implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

//	void run() {
//		System.out.println("시작합니다.");
//	}
}

class StartClass implements Runnable {

	@Override
	public void run() {
		System.out.println("시작합니다.");
	}
//	void start() {
//		System.out.println("시작합니다.");
//	}

}

interface FunctionInterFace {
	void showMessage(String msg);
}

interface FuctionInterfaceWithReturn {
	String getName(String name);
}

public class LambdaExample {
	String prog;

	public static void main(String[] args) {
		Runnable run = new RunClass();
		run.run();
		Runnable start = new StartClass();
		start.run();
		
		 //인터페이스를 구현하는 익명의 구현객체를 만들때 
	     //람다표현식(매개값) -> {구현코드;}
	     // 기능을 구현할 때 간단하게 표현.
		Runnable anony = () -> {
			System.out.println("또다른실행합니다.");
			
		};
		
		anony.run();
		
		FunctionInterFace fi = msg -> {
			 for(int i = 0; i< 3; i++)
		            System.out.println("메세지: " + msg);
		};
	
	FuctionInterfaceWithReturn fiw = (String name) -> {
		return "반갑습니다!" + name;
	};
	String result = fiw.getName("홍길동");
	System.out.println(result);

	
	}	
}
