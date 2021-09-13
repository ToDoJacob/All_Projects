package co.yedam.excel;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExcelWriterExample {

	public static void main(String[] args) {
		
		//사원정보 IT_PROG 사원정보.
		EmpDAO dao = new EmpDAO();
		
		//원본 스트림
		List<Employee> itList;
		
		itList = dao.getEmpList().stream()
				.filter(e -> e.getJobId().equals("IT_PROG"))
				
//				.filter(new Predicate<Employee>() {
//					@Override
//					public boolean test(Employee e) {
//						return e.getJobId().equals("IT_PROG");
//					}})
				.collect(Collectors.toList());
		
				
		
		
		
		ExcelWriter writer = new ExcelWriter();
		writer.xlsWriter(itList);
//		writer.getFields();
		System.out.println("end of prog");
	}

}
