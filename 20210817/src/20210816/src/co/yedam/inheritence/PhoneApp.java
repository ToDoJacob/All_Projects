package co.yedam.inheritence;

public class PhoneApp {
	public static void main(String[] args) {
		
		DmbCellPhone phone = new DmbCellPhone("sm","black",10);
		phone.powerOn();
		phone.turnOn();
		phone.changeChannel();
		phone.sendVoice();
		phone.powerOff();
	}

}
