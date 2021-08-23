package co.yedam.inheritence;

public class CellPhone {

	private String model;
	private String color;
	
	public CellPhone() {}
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	
	
	public String getModel() {return model;	}
	public void setModel(String model) {this.model = model;	}
	public String getColor() {return color;	}
	public void setColor(String color) {this.color = color;	}
	
	public void powerOn() {System.out.println("전원 on");}
	public void powerOff() {System.out.println("전원 off");}
	public void bell() {System.out.println("bell");}
	public void sendVoice() {System.out.println("메세지 전송 ");}
	public void reveiveVoice() {System.out.println("메세지 수신");}
}
