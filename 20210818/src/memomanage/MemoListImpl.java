package memomanage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MemoListImpl implements MemoList {

	ArrayList<Memo> list = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	
	@Override
	public void input(Memo memo) {
//		//번호
////		int no = scanner.nextInt();
//		int no = ScannerUtil.readInt();
//		//날짜
////		String date = scanner.next();
//		String date = ScannerUtil.readDate();
//		//내용
////		String content = scanner.next();
//		String content = ScannerUtil.readMultiLine("끝내고 싶으면 .end 만드세요");
//		//리스트에 추가
//		list.add(new Memo(no, date, content));
		list.add(memo);
	}
	@Override
	public void print() {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getNo());
			System.out.println(list.get(i).getDate());
			System.out.println(list.get(i).getContent());
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String date) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void delete(int no, String date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(int no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(String date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchContent(String content) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Memo> selectAll() {
		return list;
	}
	
	
}
