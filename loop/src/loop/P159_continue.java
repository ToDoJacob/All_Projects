package loop;

public class P159_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복 블럭내에서, 반복의 시작위치로 바로 이동 : continue키워드
		for(int i=1; i<=10; i++)
		{
			//변수 i의 내용이 '홀수'이면, 반복 블럭내의 하단 코드들을 수행하지않고, 시작지점으로 바로이동.
			if(i%2 != 0) 
			{
				continue;		
			}
			System.out.println(i);
		}

	}

}
