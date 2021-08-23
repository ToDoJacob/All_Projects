package com.Jacob.app;
class Member{
	String id;
	String name;
	public Member() {}
	public Member(String id, String name) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		Member target = (Member)obj;
//		return this.id.equals(target.id);
		return this.name.equals(target.name);
	}
//	@Override
	public String toString() {
		return "Member [id= " + id +" , name=" +name + "]";
	}

	
	
}
public class ObjTest {

	public static void main(String[] args) {
		Member member = new Member("100","±è±æµ¿");
		Member member2 = new Member("101","È«±æµ¿");
		System.out.println(member);
		
		System.out.println(member.equals(member2));
		
		
	
	}

}
