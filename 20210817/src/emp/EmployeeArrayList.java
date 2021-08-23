package emp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeArrayList
		implements EmployeeList {
	//ΩÃ±€≈Ê
			static EmployeeArrayList instance = new EmployeeArrayList();
			public static EmployeeList getInstance() {
				return instance;
			}
		
	ArrayList<Employee> list;
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void init() {
		list = new ArrayList<Employee>();
	}
	@Override
	public void input() {
		System.out.printf("%d ªÁπ¯>",list.size());
		int no = scanner.nextInt();
		
		System.out.print("¿Ã∏ß>");
		String name = scanner.next();
		
		System.out.print("±ﬁø©>");
		int sal = scanner.nextInt();
		
		list.add(new Employee(no, name, sal));
	}
	@Override
	public String search(int employeeId) {
		Sting name = "";
		
		for(int i=0; i<list.size(); i++) {
			if(employeeId == list.get(i).getEmployeeId()) {
				name = list.get(i).getName();
				break;
			}
		}
		return name;
	}
	@Override
	public void print() {
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%5d %10s %7d\n",
								list.get(i).getEmployeeId(),
								list.get(i).getName(),
								list.get(i).getSalary());
	}
	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}
		
}
