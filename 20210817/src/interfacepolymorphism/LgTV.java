package interfacepolymorphism;

public class LgTV implements TV {
	Speaker speaker;	 
	
	public LgTV() {}
	public LgTV(Speaker speaker) {
		this.speaker = speaker;
	}
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public void powerOn() {
		System.out.println("LgTV powerOn");
	}
	public void powerOff() {
		System.out.println("LgTV powerDown");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}	
}
