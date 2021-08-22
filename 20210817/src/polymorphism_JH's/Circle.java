package polymorphism;

public class Circle extends Shape {
	private int r;                           //반지름 

	//기본 생성자
	public Circle() {}
	
	
	
	public Circle(String color) {
		setColor(color);
	}



	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}



	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	
	
}
