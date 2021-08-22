package loop;

public class P161Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = 1;
//		int b = 1;
//		while (a <= 6)
//		{
//			while (b <= 6)
//			{
//				while ((a+b) = 5)
//			}
//			System.out.println((int) (Math.random() * 6)+1);
//		
//		}
		
		//주사위 2개 던짐.
		// 1번 주사위 --> 1~6
		// 2번 주사위 --> 1~6
		// (1번 주사위 번호, 2번주사위 번호)
//		int Sum;
//		do
//		{
//			int Dice1 = (int) (Math.random() * 6) + 1;
//			int Dice2 = (int) (Math.random() * 6) + 1;
//			
//			System.out.println("(" + Dice1 + "," + Dice2 + ")" );
//			
//			Sum = Dice1 + Dice2;
//		}
//		while ( Sum != 5 );

		
		
//		int Sum;
//		int Dice1;
//		int Dice2;
//		while ( true )
//		{
//			Dice1 = (int) (Math.random() * 6) + 1;
//			Dice2 = (int) (Math.random() * 6) + 1;
//			
//			System.out.println("(" + Dice1 + "," + Dice2 + ")" );
//			
//			Sum = Dice1 + Dice2;
//			if ( Sum == 5)
//			{
//				break;
//			}
//		}
		
		// while문으로 하는법
//		int Sum = 0;
//		while ( Sum != 5 )
//		{
//			int Dice1 = (int) (Math.random() * 6) + 1;
//			int Dice2 = (int) (Math.random() * 6) + 1;
//			
//			System.out.println("(" + Dice1 + "," + Dice2 + ")" );
//			
//			Sum = Dice1 + Dice2;
//		}
		
	
		//원하는 값이 출력된 후 다른 문구 출력하는 방식.
		for ( int Sum = 0 ; Sum != 5; )
		{
			int Dice1 = (int) (Math.random() * 6) + 1;
			int Dice2 = (int) (Math.random() * 6) + 1;
			
			System.out.println("(" + Dice1 + "," + Dice2 + ")" );
			
			Sum = Dice1 + Dice2;
			
			if ( Sum != 5)
			{
				System.out.println("다음기회에.");
			}
			else
			{
				System.out.println("수고하셨습니다.");
			}
		}
		
		
		
	}

}
