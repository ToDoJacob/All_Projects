package co.jacob.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {

//		write1();
//		read1();
		read2();

	}
	//버퍼를 통해서 파일입력
	public static void read2() {
		try {
			FileReader fr = new FileReader("C:/Temp/addr.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			while(true) {
				s = br.readLine();
				if(s == null) break;
			}
			br.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	//종현이꺼
	public static void read1() {
	      try {
	         
	         FileReader fr = new FileReader("C:/Temp/addr.txt");   //파일명은 동일 
	         char[] arr = new char[100];
	         
	         while(true) {
	            int a = fr.read(arr);
	            if(a == -1)break;
	            for(int i =0;i<a;i++) {   //쓰레기 값이 들어갔을 테닌까 a의 크기만큼만 읽어주면 됨 
	               System.out.print(arr[i]);
	            }
	            //char[] -> String으로 변환 
	            //for문 안쓰고 하는 것 
	            // 검색해서 찾아보기 
	         }
	         fr.close();
	      }catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
	//내가한거
//	public static void read1() {
//		try {
//			FileReader fr = new FileReader("c:/Tem/addr.txt");
//			char[] arr = new char[100];
//			while(true) {
//				int a = fr.read(arr);
//				if(a == -1) break;
//				for(int i=0; i<a; i++) {
//					System.out.print(arr[i]);
//				}
//				//char[] -> string으로 출력하는거하는데 for문대신 string으로 변환하여 출력 구글링해서
//			}
//			fr.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	public static void write1() {
		try {
			FileWriter fw = new FileWriter("c:/Temp/addr.txt");
			System.out.println("입력 > ");
			Scanner scanner = new Scanner(System.in);
			String s = null;
			while(true) {
				try {
					s = scanner.nextLine();
				} catch(NoSuchElementException e) {
					break;
				}
				fw.write(s+"\n");	
			}
			fw.close();
			System.out.println("생성!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
