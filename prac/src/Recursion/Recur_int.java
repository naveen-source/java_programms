package Recursion;

public class Recur_int {
	public static void test(int a)
	{
	
		System.out.println(a);
		a--;
		
		if(a==0)
		{
			return;
			
		}
		test(a);
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(4);
	}

}
