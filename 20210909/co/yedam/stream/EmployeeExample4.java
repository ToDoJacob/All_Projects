package co.yedam.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EmployeeExample4 {

	public static void main(String[] args) {
		// 사원중에서 급여 5000이하 사람들의 이름과 이메일을 출력.
		EmpDAO dao = new EmpDAO();
		try {
			FileOutputStream fos = new FileOutputStream("emp.txt");

			dao.getEmpList().stream() // stream 생성
					.filter((t) -> t.getSalary() <= 5000) //
					.sorted()
					.forEach(t -> {
						System.out.printf("이름: %s, 이메일: %s\n", t.getLastName(), t.getEmail());
						String info = t.getLastName() + ", " + t.getEmail() + "," + t.getSalary() + "\n";
						byte[] readByte = info.getBytes();
						try {
							fos.write(readByte);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}); // Conllector<Employee,A,R>
			fos.close(); //리소스들은 사용하고 close해줘야한다.
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
}
