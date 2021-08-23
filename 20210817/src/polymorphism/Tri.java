package polymorphism;

public class Tri extends Shape {
	private int ex;
	private int ey;
	
	public int getEx() {
		return ex;
	}


	public void setEx(int ex) {
		this.ex = ex;
	}


	public int getEy() {
		return ey;
	}


	public void setEy(int ey) {
		this.ey = ey;
	}


	public Tri() {}
	
	
	public Tri(String color) {
		setColor(color);
	}
	
	
	public void draw() {
		System.out.println("삼각형도형");
	}
	
	

	
}
