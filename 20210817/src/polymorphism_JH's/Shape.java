package polymorphism;

public abstract class Shape {
	
	//모든 도형들의 공통
	
	private String color;
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public int getSx() {
		return sx;
	}

	public void setSx(int sx) {
		this.sx = sx;
	}

	public int getSy() {
		return sy;
	}

	public void setSy(int sy) {
		this.sy = sy;
	}

	private String line;
	private int sx;
	private int sy;
	
	public abstract void draw();	
	
}
