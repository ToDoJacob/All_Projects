
public class P144Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String position = "과장";
		
//		switch(position) 
//		{
//			case "부장":
//				System.out.println("700만원");
//				break;
//			case "과장":
//				System.out.println("500만원");
//				break;
//			default:
//				System.out.println("300만원");
//		}

		if ( position.equals( "부장" ) )
		{
			System.out.println("700만원");
		}
		else if ( position.equals( "과장" ) )
		{
			System.out.println("500만원");
		}
		else
		{
			System.out.println("300만원");
		}
			
	}

}
