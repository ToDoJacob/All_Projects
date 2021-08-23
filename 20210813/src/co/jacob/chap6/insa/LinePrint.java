package co.jacob.chap6.insa;
// 클래스 = 필드 + 메서드


//메서드 쓰는 목적
//1.data처리
//2.반복되는 코드를 메서드 선언

//메서드 오버로딩 : 같은이름의 메서드 여러개 선언 단, 매개변수의 타입,갯수는 달라야한다.

public class LinePrint {
  void print() {
	 System.out.println("=================");
  }
	 
	 void print(int cnt){
		 for(int i=0; i<cnt; i++) {
			 System.out.println("=");
		 }
		 System.out.println();
	 }
	 
	 
	 void print( int cnt, String s ){
		 for(int i=0; i<cnt; i++) {
			 System.out.println(s);
		 }
		 System.out.println();
	 }
 }
