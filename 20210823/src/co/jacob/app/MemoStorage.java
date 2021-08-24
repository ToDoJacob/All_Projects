package co.jacob.app;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class MemoStorage {

	List<Memo> memos = new ArrayList<>();
	
	//싱글톤
	//매번 객체를 생성하지않고 getInstance로 받아쓰는것
	private static MemoStorage instance = new MemoStorage();
	public static MemoStorage getInstance() {
		return instance;
	}
	
	//read
	
	//file save
	File file = new File("c:/Temp/memo.txt");
	public void fileSave() {
		try {
			FileWriter fw = new FileWriter(file);
			for(Memo memo : memos) {
				fw.append(memo.toString());
			}
			fw.close();
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	
	//리스트에 추가
	public boolean saveDate(Memo memo) {
		return memos.add(memo);
		
	
	}
	//삭제
	public void deleteData(String no) {
		//Iterator쓰는방법
//		Iterator<Memo> iter = memos.iterator();
//		
//		while(iter.hasNext()) {
//			if(iter.next().getNo().equals(no)) {
//				iter.remove();
//		}
				
		//for문쓰는방법
//		for(int i=0; i<memos.size(); i++) {
//			if(no.equals(memos.get(i).getNo())) {
////			if(memos.get(i).getNo().equals(no)) {
//				memos.remove(i);
//				}
//		}
		
		//향상된for문 쓰는방법
		for(Memo memo : memos) {
			if(memo.getNo().equals(no)) {
				memos.remove(memo);
			}
		}
			
	}
	//전체조회
	public List<Memo> searchData() {
		return memos;
	}
		
		
	
//	//조회
//	public void searchData() {
//		
//	}
}
