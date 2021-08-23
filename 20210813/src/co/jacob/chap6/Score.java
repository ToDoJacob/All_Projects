package co.jacob.chap6;

/*객체지향
1.설계 프로그램 : 국어성적을 처리할 프로그램
	data :	int[]   <-- 필드
	기능	 :	전체출력  <-- 메서드(함수)
			합계
			최댓값
*/
//표기법 :자바ㅇ 카멜케이스 ex)KorScore,
//		오라클은 스네이크케이스 ex)Kor_score
//2. 설계도를 작성
public class Score {
	int[] kor = new int[] { 100,80,70};
	
	public void print() {
		for(int temp : kor) {
			System.out.println(temp);
		}
	}
	
	public void total() {
		int sum = 0;
		for(int temp : kor) {
			sum += temp;
		}
		System.out.println(sum);
	}
		
			
	
	public void max() {
		int m=0;
		for(int temp : kor) {
		}
		System.out.println(m);
	}
}
