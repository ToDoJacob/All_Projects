package co.yedam.excel;

import java.util.Calendar;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CalendarExample {
	
	public static void main(String[] args) {
		   Scanner scn = new Scanner(System.in);
		   
		   System.out.println("년도 입력");
		   int yyyy = Integer.parseInt(scn.nextLine());
		   System.out.println("월 입력");
		   int MM = Integer.parseInt(scn.nextLine());
		   
		   callCalendar(yyyy, MM);
		   
		   scn.close();
		 
	}
	public static void callCalendar(int yyyy, int MM) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, MM-1, 1);
		System.out.println("----------[ " + yyyy + "년 " + MM + "월 ]----------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int a = cal.get(Calendar.DAY_OF_WEEK);
		   
		   for(int i = 1; i<cal.getActualMaximum(Calendar.DATE)+a; i++) {
		      System.out.printf("%3s",i);
		      if(i+cal.get(Calendar.DAY_OF_WEEK) % 7 == 0) {
					System.out.println();}
		   }
		
		
		
//		System.out.println("년도:" + cal.get(Calendar.YEAR));
//		System.out.println("월:" + (cal.get(Calendar.MONTH)+1));
//		System.out.println("일:" + cal.get(Calendar.DATE));
//		System.out.println("요일(1~7):" + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("말일:" + cal.getActualMaximum(Calendar.DATE));
		
//		IntStream.rangeClosed(1, cal.getActualMaximum(Calendar.DATE))
//				.forEach(n -> System.out.println(n));
		
		
		
		
			
		
	
		
	}
}
