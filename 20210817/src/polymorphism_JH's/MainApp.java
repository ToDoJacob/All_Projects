package polymorphism;

public class MainApp {
	public static void main(String[] args) {
	
		// 상속관계에서만 가능하다 
		Shape s = new Circle(); //부모타입의 참조변수는 자식개체를 참조 할수 있다. 
		s.draw();			//참조대상의 오버라이딩한 메서드를 호출 
		
		s = new Tri();
		s.draw();			//실행 코드는 같아도 실행 결과는 다름 (다형성 )
		
		Shape s1;
		Circle c1 = new Circle();
		c1.getR();
		
		s1 = c1;			//자동 형변환  자식을 부모에게 저장할때는 자동 형변환 
		s1.draw();  		//다형성 (참조대상 = 자식객체)의 오버라이딩 메서드 호출
							//s1.getR은 그냥 안되서 밑에 형변환을 해서 호출해줌 
		
		((Circle)s1).getR();  // s1을 Circle로 강제형변환 해서 getR을 사용 
							  // 캐스팅해서 접근 // 괄호로 형변환  우선순위를 먼저 정해줌  
		
		c1 = (Circle)s1; 	//강제 형변환 
		c1.draw();
		c1.getR();
		
		Shape s2 = new Shape();		//처음부터 부모타입으로 객체를 생성해서 
		((Circle)s2).getR();        //자식 객체에 접근하지 못해서 강제형변환을 해줘야함 
		
		Tri t1 = (Tri)s2;
		t1.draw();
		
		int a= 10;
		long l = 100;
		a = (int)l; //강제 형변환 
		
		
	}
}
