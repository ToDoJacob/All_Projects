package co.yedam.statictest;

public class Car {
	
	static Car instance = new Car();        // 객체를 static 로 만들고 
	static Car getInstance() {              // getuInstance로 가져와서 쓴다. 
		return instance;
	}
	
	
	private String name;
	private int speed;	//조회 가능, set을 사용하면 변경가능  
	
	
	void print() {
		System.out.println(name +":"+speed );
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public void setName(String name) {
		this.name = name;
	}
	

}
