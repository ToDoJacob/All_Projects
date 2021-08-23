package memomanage;

import java.util.List;

public class MemoApp {

	public static void main(String[] args) {
		MemoList memos = new MemoListImpl();
		
		//번호
//		int no = scanner.nextInt();
		int no = ScannerUtil.readInt("번호");
		//날짜
//		String date = scanner.next();
		String date = ScannerUtil.readDate("날짜");
		//내용
//		String content = scanner.next();
		String content = ScannerUtil.readMultiLine();
		
		
		memos.input(new Memo(no, date,content));
		
		List<Memo> list = memos.selectAll();
		for(Memo memo : list) {
			System.out.println(memo.getNo()+ ":" + memo.getDate());;
		}
		
		//번호
		no = ScannerUtil.readInt("삭제번호");
		//날짜
		date = ScannerUtil.readDate("삭제날짜");
		memos.delete(no,date);
		
		
	
	}

}
