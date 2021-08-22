package polymorphism;

public class MainApp2 {

	public static void main(String[] args) {
		
		Circle c = new Circle("red");
		c.setR(10);
		print(c);
		
		Tri t = new Tri("blue");
		t.setEx(5);
		print(t);
		
	}
	public static void print(Shape c) {
		System.out.println(c.getColor());
		c.draw();
		if( c instanceof Circle) {
			System.out.println(  ((Circle)c).getR()   );
		} else if(c instanceof Tri) {
			System.out.println(    ((Tri)c).getEx()   );
		}
	}
}
