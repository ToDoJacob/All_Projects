package memomanage;

import java.util.List;

public class MemoApp {

	public static void main(String[] args) {
		MemoList memos = new MemoListImpl();
		
		//��ȣ
//		int no = scanner.nextInt();
		int no = ScannerUtil.readInt("��ȣ");
		//��¥
//		String date = scanner.next();
		String date = ScannerUtil.readDate("��¥");
		//����
//		String content = scanner.next();
		String content = ScannerUtil.readMultiLine()
		
		
		memos.input(new Memo(no, date,content));
		
		List<Memo> list = memos.selectAll();
		for(Memo memo : list) {
			System.out.println(memo.getNo()+ ":" + memo.getDate());;
		}
		
		//��ȣ
		no = ScannerUtil.readInt("������ȣ");
		//��¥
		date = ScannerUtil.readDate("������¥");
		memos.delete(no,date);
		
		
	
	}

}
