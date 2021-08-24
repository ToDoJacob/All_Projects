package co.jacob.app.클래스;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberStorage
			implements MemberAccess{
	List<Member> members = new ArrayList<>();

	static MemberStorage instance = new MemberStorage();
	public static MemberStorage getInstance() {
		return instance;
	}
	@Override
	public boolean saveData() {
		
		return members.add(new Member("choi","최기자"));

	}

	@Override
	public Member deleteData(String id) {
		//Iterator 쓰는법
		Iterator<Member> iter = members.iterator();
		while(iter.hasNext()) {
			if( iter.next().getId().equals(id)) {
				return member;
			}
			
		}
		return false;
		
	}
	//리스트 모두출력(id만)
	public void searchAll() {
		
	}

	@Override
	public Member searchData(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
