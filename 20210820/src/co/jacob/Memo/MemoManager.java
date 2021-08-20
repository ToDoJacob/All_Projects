package co.jacob.Memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemoManager {
	List<Memo> memoStorage = new ArrayList<Memo>();
	Scanner scanner = new Scanner(System.in);
	File file = new File("c:/Temp", "phonbook.dat");

	// 싱글톤
	static MemoManager instance = new MemoManager();

	public static MemoManager getInstance() {
		return instance;
	}

	public MemoManager() {
		readFromFile();
	}

	public void inputData() {
		System.out.println("번호>");
		int no = Integer.parseInt(scanner.nextLine());
		System.out.println("날짜>");
		String date = scanner.nextLine();
		System.out.println("내용");
		String content = scanner.nextLine();
		memoStorage.add(new Memo(no, date, content));
	}

	// 날짜를 입력받고 해당 날짜의 메모를 모두 출력
	public void searchData() {
		System.out.println("날짜>");
		String date = scanner.nextLine();
		boolean findYn = false; //값을 못찾았으면 
		
		for(int i=0; i<memoStorage.size();i++) {
			if(date.equals(memoStorage.get(i).getDate())) {
				System.out.println(memoStorage.get(i));
				findYn = true;
			}
		}
		if(findYn == false) {
			System.out.println("해당날짜의 메모가 없습니다.");
		}
	}
	// 번호를 입력받고 한건 삭제
	public void deleteData() {
		System.out.println("번호>");
		int no = Integer.parseInt(scanner.nextLine());

//		for (int i = 0; i < memoStorage.size(); i++) {
//			if (memoStorage.get(i).getNo() == no) {
//				memoStorage.remove(i);
//			}
//			return;
//		}
		Iterator<Memo> iter = memoStorage.iterator();
		while(iter.hasNext())
		{
			Memo memo = iter.next();
			if(no == memo.getNo()) {
				iter.remove();
				System.out.println("삭제완료");
				return;
			}
		}
		System.out.println("일치하는 번호가 없습니다.");
	}
//			
//			Iterator<PhoneInfo> itr=infoStorage.iterator();
//			while(itr.hasNext())
//			{
//				PhoneInfo curInfo=itr.next();
//				if(name.compareTo(curInfo.name)==0)
//				{
//					itr.remove();
//					System.out.println("삭제완료. \n");
//					return;
//				}
			
		
		
		
	

	public void readFromFile() {
		try {
			if (!file.exists())
				return;

			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			memoStorage = (ArrayList<Memo>) ois.readObject();
			System.out.println(memoStorage);
			// 이름과 내용만출력해주는 for문
//			for(int i =0;i< list.size();i++) {
//		         System.out.println(list.get(i).getName());
//		      }
//			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void storeToFile() {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(memoStorage);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
