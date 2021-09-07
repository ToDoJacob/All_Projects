package Kinders;

import java.util.ArrayList;
import java.util.List;

public class KinderList implements KinderAccess {
	List<Kinder> kinderList = new ArrayList<>();
	
	static KinderList instance = new KinderList();
	
	public static KinderList getInstance() {
		return instance;
	}

	@Override
	public boolean saveData(Kinder kinder) {
		return false;
	}

	@Override
	public void searchData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteData(String kinder) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
