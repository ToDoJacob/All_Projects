
public class Array_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 학생 3명의 점수(정수)를 "배열"을 이용해서, 그룹화한 후 사용하는 예.
		//1. 배열 변수 선언
		//2. 배열의 크기 지정
		//3. 배열에 데이터를 저장
		//4. 배열에 저장되어있는 데이터를 꺼냄(인출)
		int[] scores = { 83, 90, 87, 100, 101, 224, 332 };
		
		for ( int k = 0; k < scores.length  ; k++)
		{
			System.out.print(k + "번 공간 : " + scores[k] + ", ");
		}
		System.out.println();
//		System.out.println("scores[0] : " + scores[0]);
//		System.out.println("scores[1] : " + scores[1]);
//		System.out.println("scores[2] : " + scores[2]);
//		
		int sum = 0;
		for(int i=0; i<3; i++)
		{
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / scores.length ;
		System.out.println("평균 : " + avg);
		
	}

}
