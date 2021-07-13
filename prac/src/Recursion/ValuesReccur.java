package Recursion;

public class ValuesReccur {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(3);
	}

	private static void test(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);
		a--;
		if(a<0)
		{
			return ;
		} 
		test(a);
	}

}
