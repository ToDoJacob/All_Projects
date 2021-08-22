package memomanage;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class _readDateJH {
   
   static Scanner sc = new Scanner(System.in);
   
   public static int readInt() {
      int result = 0;
      while(true) {
         try {
            String temp = sc.next();
            result = Integer.parseInt(temp);
            break;
         }catch (Exception e) {
            System.out.println("숫자 형식이 아닙니다.");
         }
      }
      return result;
   }
   //숫자입력
   public static int readInt(String prompt) {
      System.out.println(prompt);
      System.out.println(">");
      return readInt();
   }
   
   
   //날짜 입력 
   public static String readDate() {
      String result = "";
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      
      do {
         try {
            result = sc.next();
            sdf.parse(result.trim());
            //심플데이터 포맷을 이용해서 데이트 파스하도록 
            break;
         }catch (Exception e) {
            System.out.println("날짜 형식이 아닙니다.yyyy-MM-dd");
         }
      }while (true);
      return result;
   }
   
   public static String readDate(String prompt) {
      System.out.println(prompt);
      System.out.println(">");
      return readDate();
   }

}