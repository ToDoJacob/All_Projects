package pkg1;

public class Parent {
	private String name;	//해당 클래스내 접근가능
	String id;				//같은 패키지내 접근가능(디폴트)
	protected String pw;	//같은 패키지내 or 다른패키지라도 상속관계면 접근가능
	public String addr;		//모든패키지 접근가능
}
