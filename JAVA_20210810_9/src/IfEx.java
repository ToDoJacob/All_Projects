
public class IfEx {

	public static void main(String[] args) {
		//점수를 저장
		//저장된 점수를 빼서 90이상이면 A
		//80이상이면 B
		//70이상이면 C
		//70미만이면 D
//		int score = 75;
//		
//		if(score>=90) {
//			System.out.println("점수가 100~90입니다.");
//			System.out.println("등급은 A입니다.");
//		} else if(score>=80) {
//			System.out.println("점수가 80~89입니다.");
//			System.out.println("들급은 B입니다.");
//		} else if(score>=70) {
//			System.out.println("점수가 70~79입니다.");
//			System.out.println("등급은 C입니다.");
//		} else {
//			System.out.println("점수가 70 미만입니다.");
//			System.out.println("등급은 D입니다."); 
//		}
		int score = 78;

		char yourGrade = 0;

		if ( (score >= 90 ) && ( score <= 100 ) )

		{

		yourGrade = 'A';

		}

		else if (( score >= 80 ) && ( score < 90 ) )

		{

		yourGrade = 'B';

		}

		else if (score >= 70 )

		{

		yourGrade = 'C';

		}

		else if (score < 70 )

		{

		yourGrade = 'D';

		}

		System.out.println( "당신의 취득등급은" + yourGrade);

	}

}
