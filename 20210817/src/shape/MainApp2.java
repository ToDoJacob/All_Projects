package shape;

public class MainApp2 {

	public static void main(String[] args) {
		Movable m = new Circle();
		m.move();
		print(m);
		
		m = new Rect();
		print(m);
	}
	public static void print(Movable c) {
		if(c instanceof Circle)
		((Circle)c).draw();
		else if (c instanceof Rect)
			((Rect)c).draw();
	}
}
