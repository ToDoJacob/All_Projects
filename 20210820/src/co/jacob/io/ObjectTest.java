package co.jacob.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectTest {

	public static void main(String[] args) {
//		write1();
		read1();
	}
	public static void read1() {
		try {
			FileInputStream fis = new FileInputStream("c:/Temp/emp.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<Emp> list = (ArrayList<Emp>)ois.readObject();
			//이름과 내용만출력해주는 for문
			for(int i =0;i< list.size();i++) {
		         System.out.println(list.get(i).getName());
		      }
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void write1() {
		ArrayList<Emp> list = new ArrayList<>();
		list.add(new Emp(1, "루피","고무고무"));
		list.add(new Emp(2, "조로","호랑이참격"));
		list.add(new Emp(3, "상디","디아블잠브"));
		
		try {
			FileOutputStream fos = new FileOutputStream("c:/Temp/emp.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
