package com.Jacob.app;

import java.lang.reflect.Field;

public class ClassTest {

	public static void main(String[] args) {

		Class c = Member.class;
		System.out.println(c.getName());
		System.out.println(c.getPackage());
		
		Field[] fields = Member.class.getDeclaredFields();
		
		
		for(int i=0; i<fields.length; i++) {
			System.out.println(fields[i].getName());
		}
		
//		System.out.println(c.getResource("/a.txt").getPath());
		
		System.out.println(c.getResource("/com/Jacob/app/a.txt").getPath());
		
	}

}
