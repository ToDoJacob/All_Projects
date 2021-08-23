
public class P173_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//데이터가 보관된 실제장소(Heap영역의 어디)의 "주소(point)"를 저장하는, 참조형 변수는.
		//데이터를 생성하는 방식을 어떻게 했느냐에 따라서, 저장되는 주소가 같을 수도 다를 수도 있다.
		//1. 리터럴 방식으로 데이터 생성 후, 저장 ---> 주소가 동일(즉, 주소를 공유)
		//2. 그 외의 방식으로 데이터를 생성 후, 저장 ---> 데이터 생성 시 마다, 별도의 공간이 생성되므로 주소가 다름.
		
		//리터럴 방식 ( Hard coding)으로 데이터 생성시.
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		// 참조형 변수 v1, v2의 내용을 비교.
		
		if(strVar1 == strVar2 ) 	// 참조형 변수가 담고있는 "주소"를 비교.
		{
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}
		else
			{
			System.out.println("strVar1과 strVar2는 참조가 다름");
			}
		
		// 참조형 변수가 담고 있는 "주소"로 찾아가서, "데이터"자체를 비교.
		
		if(strVar1.equals(strVar2))
		{
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		//new를 이용하여, 코드 복사를 하는 과정을 통해 데이터 생성시.
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4)                //.equals로 객체 내용을 서로 비교하면 같다고 나옴.
		{
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}
		else
		{
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
	}

}
