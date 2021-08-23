package shape;

public class Triangle extends Shape {
	private int ex;
	private int ey;
	
	public Triangle() {}
	public Triangle(String color) {
		setColor(color);
	}
	
	public int getEx() {
		rturn ex;
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
	public void draw( ) {
		System.out.println("»ï°¢ÇüµµÇü");
	}
	
}
