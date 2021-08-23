package polymorphism;

public class MainApp {

	public static void main(String[] args) {
		
		Shape s = new Circle(); 
				//부모타입의 참조변수는 자식객체를 참조 할 수있다. 
	Shape s1;
	Circle c1 = new Circle();
	s1 = c1;
	
	
	
	}

}
