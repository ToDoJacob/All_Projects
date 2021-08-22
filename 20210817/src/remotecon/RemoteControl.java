package remotecon;
//통합리모콘 -> TV, Audio

//개발표준,교체

public interface RemoteControl {
	
	
	int MAX_VOLUME = 10; // 앞에 public static final이 붙어있다
	void turnon();		//public abstract
	void turnoff();
	void setvolume(int volume);
}
