package com.Jacob.app;

public class StringUtil {
	// 성별
	public static String findSex(String ssn) {
		if (ssn == null && ssn.isEmpty()) {
			return null;
		}
		char sex = ssn.charAt(7);
		String result = null;
		switch (sex) {
		case '1':
		case '3':
		case '5':
			result = "남";
			break;
		case '2':
		case '4':
		case '6':
			result = "여";
		}
		return result;
//		return (sex =='1'?"남":"여" );
	}
	
	/**
	 * 파일경로에서 파일명 추출
	 * @param path 파일경로명
	 * @return 파일명
	 * @author kym
	 * @since jdk1.3
	 */
	public static String findFileName(String path) {
		if (path == null || path.isEmpty()) {
			return null;
		}
		return path.substring(path.lastIndexOf("/")+1);	
		
	}

}
