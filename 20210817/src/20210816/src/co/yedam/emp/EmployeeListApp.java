package co.yedam.emp;

import java.util.Scanner;


public class EmployeeListApp {
public static void main(String[] args) {
	
   EmployeeList app =  EmployeeList.getInstance();
   //	new EmployeeList(); private 선언 시에는 위에 처럼 사용야함
   
   Scanner scanner = new Scanner(System.in);
   int selectNo = 0;
   boolean run = true;

   while (run) {
      System.out.println("0.종료  1.사원수  2.사원정보입력  3.사원리스트  4.검색  5.급여합계    6.종료");
      System.out.print("선택>");
      selectNo = scanner.nextInt();
      if (selectNo == 1) {
         app.init();
      } else if (selectNo == 2) {
         app.input();
      } else if (selectNo == 3) {
         app.print();
      } else if (selectNo == 4) {
         System.out.print("검색할 사번>");
         int no = scanner.nextInt();
         String name = app.search(no);
         System.out.println("이름은 "+ name);
      }else if (selectNo == 5) {
         int s = app.sum();
         System.out.println("급여합계 = " + s);
      } else if (selectNo == 0) {
         run = false;
      }
   }
   System.out.println("프로그램 종료");
   scanner.close();
}
}