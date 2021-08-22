package loop;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int A =1; A <= 9 ; A++ )
//		{
//			System.out.println(2*A);
//		}
		
//		for(int m=2; m<=9; m++) {
//			System.out.println("***" + m + "단***");
//			for (int n=1; n<=9; n++) {
//				System.out.println(m + " x " + n + " = " + (m*n));
//			}
//		}
		
//		int m = 2;
//		while ( m <= 9)
//		{
//			System.out.println("***" + m + "단***");
//			m++;
//			
//			int n=1;
//			while ( n <= 9)
//			{
//				System.out.println(m + " x " + n + " = " + (m*n));
//				n++;
//			}
//		}
//		
		
//	      int m=2;
//	      int n=1;
//	      while(m<=9) {
//	            System.out.println("***" + m + "단***");
//	         while(n<=9) {
//	            int ans = m*n;
//	               System.out.printf("%d*%d=%d\n",m,n,ans);   
//	               n++;
//	         }
//	         m++;
//	         n=1;
//	      }
	      
//		for( int k = 2; k <= 9; k++)
//		{
//			System.out.println("***" + k + "단***");
//	      for( int a = 1; a <= 9; a++ )
//	      {
//	    	  System.out.println(k + " x " + a + " = " + (k*a));
//	      }
//		}
	     
		
		for ( int a = 2; a <= 9; a++ )
		{
			for ( int b = 2; b <= 9; b++ )
			{
				long ans = (long) Math.pow(a, b);
				System.out.println(a + "의 " + b + "제곱 "+ ans );
			}
		}
	}
}
	      
	


