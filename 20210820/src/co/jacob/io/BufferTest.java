package co.jacob.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferTest {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String a = br.readLine();
		System.out.println(a);
	}

}
