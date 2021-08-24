package co.jacob.app.클래스;

public class Member {
	static String UNIV_NAME = "예담";
	private String id;
	private String name;
	
	
	public Member(){}
	Member(String id){
		this.id = id;
	}
	Member(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return id + "," + name ;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
}
