package com.Jacob.app;

public class StringTest {

	public static void main(String[] args) {
		
		String ssn = "930725-1234567";
		
		Object obj = new Object();
		
		//문자열길이
		int s = ssn.length();
		System.out.println("길이 : " + s);
		
		//성별
//		char sex = ssn.charAt(7);
//		System.out.println("성별 : " + (sex =='1'?"남":"여" ));
		System.out.println("성별 : " + StringUtil.findSex(ssn));
		
		//출생연도
		String year = ssn.substring(0, 2);
		System.out.println("년도 : " + year);
		
	
		
		//맨뒤에 확장자를 자르고 싶을경우
		//.의 위치를 찾아내고 그뒤의 모든 문자를 선택하면 그게 확장자.
		String fname = "c:/images/2021/home.png";
//		int idt = fname.indexOf(".");
		String ext = fname.substring(fname.indexOf(".")+1);
		
		System.out.println("확장자 : " + ext);
		
		
		//파일명
//		String name = fname.substring(fname.lastIndexOf("/")+1);
//		System.out.println("확장자 : " + name);
		String name = StringUtil.findFileName(fname);
		System.out.println("파일명 : " + name);
		
		
		String[] ff = name.split("[.]");
		System.out.println(ff[0] +"----" + ff[1]);
		
		
		//치환
		String result = fname.replace("2021", "2020");
		System.out.println(fname);
		System.out.println(result);
		
		//스트링 비교
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s1==s3);
		
		//문자열 연산, 조작 (+) StringBuffer,	StringBuilder
		StringBuffer sb = new StringBuffer();
		sb.append("hi")
			.append("every")
			.append("buy");	//"hi" + "ev" + "buy"보다는 성능이 우월
		
		sb.replace(0, 2, "happy");
		System.out.println(sb);
		
		String str = sb.toString();
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
