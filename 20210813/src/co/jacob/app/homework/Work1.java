package co.jacob.app.homework;

public class Work1 {

		//이름을 인수로 입력받아서 인사말을 출력하는 프로그램 작성
		//실행 : java Work1 홍길동
		//결과 : 홍길동님 안녕하세요
		
		String name = "김동관";
		
		public Work1(String guestname) {
			name = guestname;
		}
		
		public Work1() {
		}
		
		public void printName() {
			System.out.println(name);
		}
		
		public void printWork1() {
			System.out.println(name + "님 안녕하세요.");
		
		
		
	}

}
