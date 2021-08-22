package co.jacob.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteTest {

	public static void main(String[] args) {
//		write1();
		try {
			// write2();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		read1();
//		read2();
		filecopy();
	}

	public static void filecopy() {
		try {
			FileInputStream fis = new FileInputStream(new File("c:/Temp" , "bigmatch.jpg"));
			FileOutputStream fos = new FileOutputStream("c:/Temp/bigmatch2.jpg");
			byte[] arr = new byte[100];
			while(true) {
				int a = fis.read(arr);
				if(a == -1) break;
				fos.write(arr,0,a);
			}
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// read2
	public static void read2() {
		try {
			FileInputStream fis = new FileInputStream("c:/Temp/data2.dat");
			byte[] arr = new byte[2];
			while (true) {
				int a = fis.read(arr);
				if (a == -1)
					break;
				for (int i = 0; i < a; i++) {
					System.out.println(arr[i]);
				}
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void read1() {
		try {
			FileInputStream fis = new FileInputStream("c:/Temp/data2.dat");
			while (true) {
				int a = fis.read();
				if (a == -1)
					break;
				System.out.println(a);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 바이트 배열
	public static void write2() throws Exception {

		byte[] arr = new byte[] { 10, 20, 30 };
		FileOutputStream fos = new FileOutputStream("c:/Temp/data2.dat");
		fos.write(arr);
		fos.flush();
		fos.close();
		System.out.println("생성");
	}

	// 1바이트씩 출력
	public static void write1() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/Temp/data1.dat");
			byte a = 10;
			byte b = 20;
			fos.write(a);
			fos.write(b);
			fos.flush();
			fos.close();
			System.out.println("생성");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
