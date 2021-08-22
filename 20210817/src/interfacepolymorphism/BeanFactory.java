package interfacepolymorphism;

//IoC 기능 (객체생성해서 주입) 
public class BeanFactory {
	public Object getBean(String tv, String speaker) {
		Speaker speakerObj = null;;
		if(speaker.equals("sony")) {
			speakerObj = new SonySpeaker();
		} else if(speaker.equals("apple")) {
			speakerObj = new AppleSpeaker();
		}
		if(tv.equals("samsung")) {
			return new SamsungTV(speakerObj);
		} else if(tv.equals("lg")) {
			return new LgTV(speakerObj);
		}
		return null;
	}
}
