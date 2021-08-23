package co.jacob.app;

public class ArrayEx {

	public static void main(String[] args) {
		
//		int kor[] =new int[10]{100,80,10,40};
//		int eng[] =new int[10]{100,22,11,20};
//		int mat[] =new int[10]{43,32,55,55};
		
		int score[][] = new int[][] {
			{100,80,10,40},	//국어
			{100,22,11,20}, //영어
			{43,32,55,55} // 수학
		};
		
		//성적 출력
		System.out.println("=====국어=====");
		for(int i=0; i<score[0].length; i++) {
			System.out.println(score[0][i]);
		}
		
		System.out.println("=====영어=====");
		for(int k=0; k<score[1].length; k++) {
			System.out.println(score[1][k]);
		}
		
		System.out.println("=====국어 영어  수학=====");
		for(int k=0; k<score[0].length; k++) {
			System.out.println(score[0][k] + " " + score[1][k] + " " + score[2][k]);
		}
		/*
		 * 학생0 100 100 43
		 * 학생1 80 22 32
		 * 학생2 10 11 55
		 * 학생3 40 20 55
		 */
		System.out.println("=====학생별 국어 영어 수학 성적 다중 for문=====");
		for(int k=0; k<=score.length; k++) {
			for(int a=0; a<score.length; a++) {
			System.out.print(score[a][k] + " ");
			}
			System.out.println();
		}
		
		
		//과목별로 출력
		//국어 : {100,80,10,40}
		//영어 : {100,22,11,20}
		//수학 : {43,32,55,55}
//		System.out.println("=====과목별 성적=====");
//		for(int k=0; k<score.length; k++) {
//			System.out.print(score[k] + " ");
//			}
//			System.out.println();
//		
		String[] className = new String[] {"국어", "영어", "수학"};
//		System.out.println(className[i]);
//		if(i==0) System.out.println("국어");
		System.out.println("====과목별 출력====");
		int i=0;
		for( int[] arr : score ) {
			System.out.println(className[i++] +" ");
			for( int s : arr ) {
				System.out.print(s +" ");
			}
			System.out.println();
		}
		
		
		System.out.println("==========");
		for (int W=0; W<score.length; W++)
		{
			if (W==0) System.out.println("국어 : ");
			if (W==1) System.out.println("수학 : ");
			if (W==2) System.out.println("영어 : ");
		}
		
		
		
//		
//		int[] kor = new int[5];
//		kor[0] = 100;
//		kor[1] = 90;
//		kor[2] = 80;
//		kor[3] = 70;
//		kor[4] = 60;
//		
//		//전체 성적 조회
//		for(int i=0; i<kor.length; i++) {
//			System.out.println(kor[i]);
//		}
//		
//		System.out.println("향상된 for문 사용");
//		for( int temp : kor) {
//			System.out.println(temp);
//		}
//		
//		
//		
//		
//		
		
		
		
	}

}
