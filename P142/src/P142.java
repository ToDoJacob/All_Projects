
public class P142 {

	public static void main(String[] args) {

				int DiceNum = ( int ) ( Math.random() * 6 ) + 1;
				System.out.println( DiceNum );

				String message = "";


				switch ( DiceNum )

				{
					case 1:
						message = "1번";
						break;
					case 2:
						message = "2번";
						break;
					case 3:
						message = "3번";
						break;
					case 4:
						message = "4번";
						break;
					case 5:
						message = "5번";
						break;
					case 6:
						message = "6번";
						break;
				}
				
				System.out.println(message);
	}

}
