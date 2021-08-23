package co.yedam.inheritence;

public class DmbCellPhone extends CellPhone {
	private int channel;
	
	public DmbCellPhone() {
		super(); //부모클래스의 생성자 호출
	}

	public DmbCellPhone(String model, String color, int channel) {
		//super(model, color); super()
		this.channel = channel;
	}
	
	public void turnOn() {
		System.out.println("dmd on");
	}
	public void turnOff() {
		System.out.println("dmd off");
	}
	public void changeChannel() {
		System.out.println("change channel");
	}
	
	
	
}
