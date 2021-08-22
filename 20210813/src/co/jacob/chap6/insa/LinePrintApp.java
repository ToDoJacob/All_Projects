package co.jacob.chap6.insa;

public class LinePrintApp {

	public static void main(String[] args) {
		
		LinePrint linePrint = new LinePrint();
		linePrint.print();
		linePrint.print();
	
		
		
		linePrint.print(10);
		linePrint.print(3);
		
		linePrint.print(2, "@");
	}

}

