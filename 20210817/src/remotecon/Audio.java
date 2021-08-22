package remotecon;

public class Audio 
	implements RemoteControl {
	private int volume;

	@Override
	public void turnon() {
		System.out.println("¿Àµð¿À ÄÒ´Ù");
	}

	@Override
	public void turnoff() {
		System.out.println("¿Àµð¿À ²ö´Ù");
	}

	@Override
	public void setvolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("¿Àµð¿À º¼·ý : " + this.volume);
	}
	
	
}
