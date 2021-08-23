import java.util.Scanner;

public class P147Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("어떤 혜택 원함?");
		Scanner myIn = new Scanner(System.in);
		String grade = myIn.nextLine();
		switch(grade)
		{
		case "A" : System.out.println("VVIP 혜택을 받으실 수 있습니다."); break;
		case "B" : System.out.println("VIP 혜택을 받으실 수 있습니다."); break;
		case "C" : System.out.println("우수 회원 혜택을 받으실 수 있습니다."); break;
		case "D" : System.out.println("일반 회원 혜택을 받으실 수 있습니다."); break;
		default: System.out.println("혜택이 없습니다.");
		}
		System.out.println("감사합니다.");
		
		
//		System.out.println("어떤 혜택 원함?");
//		char grade = 'C';
//		if ( grade == 'A')
//		{
//			System.out.println("VVIP");
//		}
//		else if( grade == 'B')
//		{
//			System.out.println("VIP");
//		}
//		else if( grade == 'C')
//		{
//			System.out.println("우수 회원");
//		}
//		else if( grade == 'D')
//		{
//			System.out.println("일반 회원");
//		}
//		else
//		{
//			System.out.println("혜택이 없습니다.");
//		}
//		System.out.println("감사합니다.");
	}

}
