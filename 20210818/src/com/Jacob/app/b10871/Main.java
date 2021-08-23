package com.Jacob.app.b10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println(arr[n - 1]);

		
//		  String in = scanner.nextLine(); 
//		  String[] arr = in.split(" ");
//		  System.out.println(n); System.out.println(x); System.out.println(arr[0]); //
//		  System.out.println(arr[n-1]); System.out.println(arr.length);
		 

		scanner.close();
	}

}
