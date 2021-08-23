package remotecon;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		//소스코드를 수정하지 않고 객체를 교체
		//Television t = new Television();
		//Audio t = new Audio();
		
		RemoteControl t = new Television();//FectoryBean.getBean(args[0]);
		
		t.turnon();
		t.setvolume(5);
		t.turnoff();
		
		
	}

}
