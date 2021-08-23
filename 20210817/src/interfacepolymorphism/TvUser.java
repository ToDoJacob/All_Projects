package interfacepolymorphism;

public class TvUser {

	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0], args[1]);
		tv.powerOn();
		tv.volumeUp();
		tv.powerOff();
	}
}
