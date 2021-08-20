package co.jacob.Memo;

import java.util.Scanner;

public class MemoApp {

	public static void main(String[] args) {
		MemoManager memoManage = MemoManager.getInstance();
		//싱글톤생성 phonebookManager 클래스 참조
		Scanner scanner = new Scanner(System.in);
		int choice;
		while(true) {
			//메뉴출력
			System.out.println("1.등록 2.검색 3.삭제 4.종료");
			//메뉴번호입력
			System.out.println("번호>");
			choice = Integer.parseInt(scanner.nextLine());
			switch(choice) {
			case MENU.INSERT: memoManage.inputData(); break;
			case MENU.SERCH: memoManage.searchData(); break;
			case MENU.DELETE: memoManage.deleteData(); break;
			case MENU.EXIT: memoManage.storeToFile(); System.exit(0);
			}
		}
	}

}
