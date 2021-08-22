package interfacepolymorphism;

public class SamsungTV implements TV {

	private Speaker speaker;	

	public SamsungTV() {}
	public SamsungTV(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	@Override
	public void powerOn() {
		System.out.println("SamsungTV powerOn ");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV powerDown");
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}	
}
