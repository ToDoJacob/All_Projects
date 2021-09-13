package co.yedam.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWriter {
	
	public Field[] getFields() {
		Field[] fields = Employee.class.getDeclaredFields();//가지고있는 필드를 다 가지고 배열에 넣어주는 함수.
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		return fields;
	}

	public void xlsWriter(List<Employee> list) {
		// eid , fname, lanme
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();
		workbook.setSheetName(0, "사원리스트");
		int rowCnt = 0;
		HSSFRow row = sheet.createRow(rowCnt++);
		HSSFCell cell;
		
		//타이틀부분 출력
		int cellCnt = 0;
		Field[] fields = getFields();
		for(Field field : fields) {
			cell = row.createCell(cellCnt++);
			cell.setCellValue(field.getName());		//1씩 증가하면서 
		}
		
		//데이터부분 출력
		for(Employee emp : list) { // List<Employee>
			cellCnt = 0;
			row = sheet.createRow(rowCnt++); // 라인 새로생성.
			
			cell = row.createCell(cellCnt++); //첫번째 컬럼
			cell.setCellValue(emp.getEmployeeId());
			
			cell = row.createCell(cellCnt++); //두번째 컬럼
			cell.setCellValue(emp.getLastName());
			
			cell = row.createCell(cellCnt++); //세번째 컬럼
			cell.setCellValue(emp.getEmail());
			
			cell = row.createCell(cellCnt++); //네번째 컬럼
			cell.setCellValue(emp.getHireDate());
			
			cell = row.createCell(cellCnt++); //다섯번째 컬럼
			cell.setCellValue(emp.getJobId());
			
			cell = row.createCell(cellCnt++); //여섯번째 컬럼
			cell.setCellValue(emp.getSalary());
		}
		
//		cell = row.createCell(0);
//		cell.setCellValue("사원번호");
//		
//		cell = row.createCell(1);
//		cell.setCellValue("FirstName");
//		
//		cell = row.createCell(2);
//		cell.setCellValue("LastName");
		
		File file = new File("사원목록.xls");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			workbook.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				workbook.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
