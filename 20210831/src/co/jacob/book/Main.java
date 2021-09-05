package co.jacob.book;

import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in); // Scanner 필드정의.

	public static void main(String[] args) {
		while (true) {
			System.out.println("1.입력 2.조회 3.수정 4.삭제 5.종료");
			int menu = scn.nextInt();// 사용자입력값을 숫자값을 읽어들임. 1 엔터
			scn.nextLine();
			if (menu == 1) {
				System.out.println("입력하세요.");
				// 입력..
				addBook();
			} else if (menu == 2) {
				System.out.println("조회하세요.");
				// 조회..
				searchBook();
			} else if (menu == 3) {
				System.out.println("수정하세요.");
				// 수정..
				modifyBook();
			} else if (menu == 4) {
				System.out.println("삭제하세요.");
				// 삭제..
				removeBook();
			} else if (menu == 5) {
				break;
			}
		}
		scn.close();
		System.out.println("end of program");
	} // end of main()

	public static void addBook() {
		System.out.println("도서코드를 입력>> ");
		String bookCode = scn.nextLine();
		
		System.out.println("도서명을 입력>> ");
		String bookTitle = scn.nextLine();
		
		System.out.println("저자명을 입력>> ");
		String bookAuthor = scn.nextLine();
		
		System.out.println("출판사를 입력>> ");
		String bookPublish = scn.nextLine();
		
		System.out.println("도서가격을 입력>> ");
		int bookPrice = scn.nextInt();
		
		Book book = new Book();
		book.setBookCode(bookCode);
		book.setBookTitle(bookTitle);
		book.setBookAuthor(bookAuthor);
		book.setBookPublish(bookPublish);
		book.setBookPrice(bookPrice);
		
		BookDAO dao = new BookDAO();
		dao.insertBook(book); // DB에 입력.
	}

	public static void searchBook() {
		System.out.println("저자를 입력>>");
		String bookAuthor = scn.nextLine();
		
		System.out.println("도서명을 입력>>");
		String bookTitle = scn.nextLine();
		
		System.out.println("출판사를 입력>>");
		String bookPublish = scn.nextLine();
		
		Book book = new Book();
	
		book.setBookAuthor(bookAuthor);
		book.setBookTitle(bookTitle);
		book.setBookPublish(bookPublish);   		//저자를 모르겠으면 엔터치고 넘어가서
													// 셋중 하나만 검색해도 조회되는것을 만들기 위함
		
		BookDAO dao = new BookDAO();			//String이면 null, int or double이면 0 or 0.0이 기본값
		List<Book> list = dao.searchBook(book);
		for (Book bk : list) { //확장된 for
			System.out.println(bk.toString());
		}
//		dao.searchBook(book);

	}

	public static void modifyBook() {
		System.out.println("수정할 책코드 입력>>");
		String bookCode = scn.nextLine();
		
		BookDAO dao = new BookDAO();
		Book rbook = dao.getBook(bookCode);			//결과값을 받아온 Book타입의 변수 rbook
		
		System.out.println("도서명을 입력>> ");
		String bookTitle = scn.nextLine();			//도서명입력에 그냥 스킵하고 엔터로 넘어가려면 if문추가
		if(!bookTitle.equals("")) {						//null이나 숫자는 연산자 !=로 비교가능한데
			rbook.setBookTitle(bookTitle);					//string은 .equals로 비교
		}
		
		System.out.println("저자명을 입력>> ");
		String bookAuthor = scn.nextLine();
		if(!bookAuthor.equals("")) {					//입력된값이 있으면(null이 아니면) 바디를 실행해준다.
			rbook.setBookAuthor(bookAuthor);					
		}
		
		System.out.println("출판사를 입력>> ");
		String bookPublish = scn.nextLine();
		if(!bookPublish.equals("")) {						//null이나 숫자는 연산자 !=로 비교가능한데
			rbook.setBookPublish(bookPublish);					//string은 .equals로 비교
		}
		
		System.out.println("도서가격을 입력>> ");
		String bookPrice = scn.nextLine();
//		int bookPrice = scn.nextInt();
		if (!bookPrice.equals("")){
			rbook.setBookPrice(Integer.parseInt(bookPrice));
		
		}
		
		dao.updateBook(rbook);			//메서드안에 connection하는 걸 넣어놨다.

	}

	public static void removeBook() {
		System.out.println("삭제할 책코드 입력>>");
		String bookCode = scn.nextLine();
		
		BookDAO dao = new BookDAO();
		
		dao.deleteBook(bookCode);
		//삭제할 책코드를 입력받아서 한건 삭제.
		
		

	}
}
