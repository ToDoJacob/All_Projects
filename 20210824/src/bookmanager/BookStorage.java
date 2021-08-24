package bookmanager;

import java.util.*;

public class BookStorage implements BookAccess {
	List<Book> books = new ArrayList<>();

	static BookStorage instance = new BookStorage();

	public static BookStorage getInstance() {
		return instance;
	}

	// add, remove,get? , iterator. 
	//indexOf란 무엇일까
//	books라는 리스트에서 Book타입의 변수book을 받아와서 불린값으로 리턴한다. 
	@Override
	public boolean saveData(Book book) {// e5 spring 프레임워크 입력받아서 기존에 책이랑 isbn 안겹치면 등록완료 겹치면 등록실패
		for (Book book2 : books) {
			if (book2.getIsbn().equals(book.getIsbn())) {

				return false; // 중복을 찾았기때문에 반복문을 끝낸다. 끝까지 돌렸는데 중복을 못찾았다는 얘기는 중복이없다는얘기(return true)

			}

		}
		books.add(book); //  for문 밖에서 책을 추가해준다.
		return true;
		

	}
//	\n은 줄바꿈 \t 는 탭한번
	@Override
	public void searchData() {
//		반복문을돌면서 리스트안에있는거를 콘솔창에 출력
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).toString());
		}
		System.out.println("\n총건수는 " + books.size()+"입니다.");
	}

// 향상된 for 문 ( 객체 : 배열) {}
	// 딜리트는 Iterator로 써야한다.
	@Override
	public boolean deleteData(String name) { // String타입의 책이름을 받아서 불린값으로 리턴한다
		// for문
//		//스트링 네임으로 책의이름을 받아서 지우는데 성공하면  true 안되면 false
//		for(Book book : books) {//books라는 책장에있는 Book타입의 book(책)을 꺼낸다
//			if(book.getName().contains(name)) {//book의 이름에 내가가진 문자열을 포함하는지
//				books.remove(book); //포함하면 책장의 해당 책을 지운다.
//				
//			}
		// Iterator는 while문이 낫다 왠지느모름 아직 for문으로 하면 무한반복해서 탈출해야함
		Iterator<Book> itr = books.iterator();// iterator라는 배열안에 Book타입이 저장된다
		boolean bool = false; // 불린타입의 bool 의 초깃값 false if 문에 안걸리면(삭제에 실패할경우) return은 false
		while (itr.hasNext()) {// 다음이 있나없나 여부를 확인
			Book book = itr.next(); // 다음껄 내자리에 직접 불러오는
			if (book.getName().contains(name)) {
				itr.remove();// 지금차례인 애를 지우겠다. 지금은 itr이라는 배열을 쓰고있기때문
				bool = true; // if문 바디안에 내용이 처리되면 리턴해줄값을 같은 바디안에 넣어준다.
			}
		}
		return bool;
	}

}
