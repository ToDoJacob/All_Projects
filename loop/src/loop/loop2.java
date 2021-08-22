package loop;

public class loop2 {

	public static void main(String[] args) {
	//코드가 존재하는 블럭(block)을 탈출하는 방법 : break키워드
		
	//주사위를 굴려서 4가 나오면 멈추는 구문
		while ( true )
		{
			int DiceNum = (int) ( Math.random() * 6 ) + 1;
			System.out.println( DiceNum );
			if ( DiceNum == 4 )   //break를 수행할지 or 말지
			{
				break;
			}
		}
		

	}

}
