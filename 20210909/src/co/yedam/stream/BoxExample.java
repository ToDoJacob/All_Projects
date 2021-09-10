package co.yedam.stream;
/*
 * Generic 사용.
 * 
*/

class Box<T> {
	T field;
	void set(T obj) {
		field = obj;
	}
	T get() {
		return field;
	}
}

class Orange{
	
}

public class BoxExample {
	public static void main(String[] args) {
		
		Box<String> boxStr = new Box<String>();
		boxStr.set("Orange");
		String rstr = boxStr.get();
		
		Box<Orange> boxOra = new Box<Orange>();
		boxOra.set(new Orange());
		Orange r = boxOra.get();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Box box = new Box();
		box.set("Orange");
		String result = (String) box.get();
		
		Orange orange = new Orange();
		box.set(orange);
		Orange orang = (Orange) box.get();
		
		String oran = (String) box.get(); //box안에는 Orange클래스의 인스턴스가 담겨있다
											//String으로 강제 형변환이 안되서 에러난다.
		
		box.set("Orange");		//Orange를 스트링값으로 받아버리면 에러는안나지만 잘못됐다
		String oraa = (String) box.get();
	}
}
